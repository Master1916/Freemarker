<html>
<head>
<title>FreeMarker learning </title>
</head>
<body>
<h>Hello World!</h>

<#assign upper = "com.litsoft.freemark.UpperDirective"?new()>

${user}
${latestProduct.url}
${latestProduct.name}
foo
 
    <@upper>
       bar
		<#-- 这里允许使用所有的FTL -->
       <#list ["red", "green", "blue"] as color>
          ${color}
       </#list>
          baaz
    </@upper>
wombat
</body>
</html>