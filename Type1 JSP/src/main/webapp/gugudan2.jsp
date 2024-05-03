<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int i; int j; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugudan column</title>
</head>

<body>

	<% int col=Integer.parseInt(request.getParameter("col"));%>

	<h1>구구단 출력</h1>
	<%
		for(int i=2; i<=col+1; i++) {
			out.print("<h2>" + i + "단</h2>");
			for(int j=1; j<10; j++) {
			
			out.print(i+"*"+j+"="+i*j + "<br />");
			}
		}

	%>
</body>
</html>