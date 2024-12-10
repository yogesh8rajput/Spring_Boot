<%@page import="com.mycompany.entity.StudentInfo"%>
<%@page import="com.mycompany.dao.StudentInfoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  StudentInfo sf=(StudentInfo) request.getAttribute("studentInfo");


%>
<h1>Student Information</h1>
 Rollno:  <%=sf.getName() %>
</body>
</html>