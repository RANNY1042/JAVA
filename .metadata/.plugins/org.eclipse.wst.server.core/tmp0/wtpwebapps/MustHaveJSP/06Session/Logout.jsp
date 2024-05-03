<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

// 방법1. 회원인증정보 속성 삭제
session.removeAttribute("UserId");
session.removeAttribute("UserName");

//방법 2. 세션(session)영역의 모든 속성을 한꺼번에 삭제
session.invalidate();

//로그인 페이지로 이동
response.sendRedirect("LoginForm.jsp");%>
