<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%!
String str2="안녕하세요!!";
String getMessage(String str1){
	if(str1==null){
		return "null null 합니다.";
	}
	else if (str1.equals("JSP"))
		return "열공합시다.";
	
	return "빡세게 합시다.";
}
%>
<!DOCTYPE html>
<html>
<%
String str1 = request.getParameter("lang");
%>
<meta charset="EUC-KR">
<title>HelloJSP</title>
</head>
<body>
<h2>처음 만들어보는<%=str1 %></h2>
<p><% 
out.println(str2+" "+str1+"입니다."+getMessage(str1)); %></p>
Hello
</body>
</html>