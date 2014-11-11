package com.litsoft.freemark;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleHash;
import freemarker.template.Template;

public class Test {
	public static void main(String[] args) throws Exception {

		
	 
		/* 在整个应用的生命周期中，这个工作你应该只做一次。 */
		/* 创建和调整配置。 */
		
		 
		Configuration cfg = new Configuration();
		//根据目录加载freemarker模板 file必须是一个目录
		cfg.setDirectoryForTemplateLoading(new File(
 				"E:/Workspaces/FreemarkLearning/src/main/webapp/WEB-INF/templates"));
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		//ObjectWrapper.BEANS_WRAPPER;
		/* 在整个应用的生命周期中，这个工作你可以执行多次 */
		/* 获取或创建模板 */
		//Environment
		//Template temp = cfg.getTemplate("test.ftl");
		//Template temp = cfg.getTemplate("test1.ftl");
		Template temp = cfg.getTemplate("test2.ftl");

		/* 创建数据模型 */

		Map root = new HashMap();
		root.put("user", "Big Joe");
		//root.put("upper", new com.litsoft.freemark.UpperDirective());
		Map latest = new HashMap();
		root.put("latestProduct", latest);
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse");
	 
		SimpleHash sh = new SimpleHash();
		// 可以拿到Java对象"simple":
		sh.put("theString", "wombat");
		// 可以拿到Java对象":
		sh.put("theObject", new TestObject("green mouse", 1200));
		/* 将模板和数据模型合并 */

		Writer out = new OutputStreamWriter(System.out);

		//temp.process(root, out);
		temp.process(sh, out);
		out.flush();
	}
}