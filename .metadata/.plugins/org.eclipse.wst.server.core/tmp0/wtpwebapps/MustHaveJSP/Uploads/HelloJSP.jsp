<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%!
String str2="�ȳ��ϼ���!!";
String getMessage(String str1){
	if(str1==null){
		return "null null �մϴ�.";
	}
	else if (str1.equals("JSP"))
		return "�����սô�.";
	
	return "������ �սô�.";
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
<h2>ó�� ������<%=str1 %></h2>
<p><% 
out.println(str2+" "+str1+"�Դϴ�."+getMessage(str1)); %></p>
Hello
</body>
</html>