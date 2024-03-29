<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 화면</title>
</head>
<body>

	<!-- request 내장 객체를 이용한 데이터 출력 -->
	<% request.setCharacterEncoding("UTF-8"); %>
	이름 : <%=request.getParameter("name") %><br>
	나이 : <%=request.getParameter("age") %><br>
</body>
</html>







