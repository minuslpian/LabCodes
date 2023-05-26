<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="voter" class="beans.UserBean" scope="session"/>
<jsp:setProperty property="*" name="voter"/>
<body>
<h4>Registration Status:${sessionScope.voter.registerVoter()}</h4>
</body>
</html>