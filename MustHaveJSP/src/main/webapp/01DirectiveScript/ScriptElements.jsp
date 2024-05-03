<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! 
public int add(int num1, int num2) {
		return num1+num2;
		}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>

<% 
int num1=0; int num2=0;
try{
	num1= Integer.parseInt(request.getParameter("num1"));
   	num2= Integer.parseInt(request.getParameter("num2"));
}
catch(Exception e){
	out.println("예외 발생 : 매개변수가 null입니다.");
	} 
   	%>
	덧셈 결과 : <%= add(num1,num2)%>


</body>
</html>