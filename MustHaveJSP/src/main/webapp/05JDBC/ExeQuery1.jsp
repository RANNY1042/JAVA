<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2 align="center">Board 목록 조회 테스트(ExecuteQuery()사용)</h2>


<%-- 	<% String var=request.getParameter("id"); %> --%>
	
	<%
    JDBConnect jdbc = new JDBConnect();

    String sql = "SELECT A.num,B.name,A.title,A.content,A.id,A.postdate,A.visitcount"
    			+"from member B, board A" 
    			+"where A.id=B.id" 
    			+"having id='musthave'";
    Statement stmt = jdbc.con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    ResultSetMetaData metaData = rs.getMetaData();
    int columnCount = metaData.getColumnCount();
    %>
    
    <form id="form">
    ID를 입력하세요 
    <input type="text"></input>
    </form>
    
	<div align="center">
		<table border="1" width="600" height="50">
			<tr align="center">
				<th>num</th>
				<th>name</th>
				<th>title</th>
				<th>content</th>
				<th>id</th>
				<th>postdate</th>
				<th>visitcount</th>

			</tr>
			
			<% while (rs.next()){ %>

			<tr align="center">
			 <%
                for (int i = 1; i <= columnCount; i++) {
                %>
                <td><%= rs.getString(i) %></td>
                <%
                }
                %>
			</tr>
		<%
		}
		
		rs.close();
		
	
		jdbc.close();
		%>
		</table>

	</div>

</body>
</html>