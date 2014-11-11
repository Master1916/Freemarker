<html>
<head>
<title>FreeMarker learning </title>
</head>
<body>
<h>Hello World!</h>
${user}
${latestProduct.url}
${latestProduct.name}
<#assign repeat="com.litsoft.freemark.RepeatDirective"?new()>

<#assign x = 1>

<@repeat count=4>
 Test ${x}
 <#assign x = x + 1>
</@repeat>


<@repeat count=3 hr=true>
Test
</@repeat>


<@repeat count=3; cnt>
  ${cnt}. Test
</@repeat>

</body>
</html>