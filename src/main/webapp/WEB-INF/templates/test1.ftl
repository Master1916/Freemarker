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
		<#-- ��������ʹ�����е�FTL -->
       <#list ["red", "green", "blue"] as color>
          ${color}
       </#list>
          baaz
    </@upper>
wombat
</body>
</html>