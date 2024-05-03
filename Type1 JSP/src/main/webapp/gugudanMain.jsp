<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugudan Main</title>
</head>
<body>
<%
String sel = request.getParameter("sel");
String colStr = request.getParameter("col");

if(sel.equals("Type1")){
	int col=Integer.parseInt(colStr);
	response.sendRedirect("gugudan1.jsp?col="+col);
}
else{
	int col=Integer.parseInt(colStr);
	response.sendRedirect("gugudan2.jsp?col="+col);
	
}%>

</body>
</html>