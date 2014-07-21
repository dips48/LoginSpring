<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Current USER:${loginfo.username}</h1>
<#list messages as msg>
<#if msg_index %2==0>
*
<#else>
!
</#if>
${msg}<br>
</#list>
</body>
</html>