<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! int i;	

%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
<%
int col= Integer.parseInt(request.getParameter("col"));
out.print("<h2>" + "구구단 "+ col + "단</h2>");
for(int i=1;i<10;i++){
out.print(col+"*"+i+"="+col*i);
out.print("<br />");}%>
</head>
<body>

</body>
</html>