<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>MemberAuth.jsp</title>
</head>
<body>
	<h2>MVC�������� ȸ�������ϱ�</h2>
	<p>
		<strong>${ authMessage }</strong>
		<br />
		<a href="./MemberAuth.mvc?id=nakja&pass=1234">ȸ������(������)</a>
		&nbsp;&nbsp;
		<a href="./MemberAuth.mvc?id=musthave&pass=1234">ȸ������(ȸ��)</a>
		&nbsp;&nbsp;
		<a href="./MemberAuth.mvc?id=stranger&pass=1234">ȸ������(��ȸ��)</a>
	</p>
</body>
</html>