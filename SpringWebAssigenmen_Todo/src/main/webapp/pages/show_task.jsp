<%@page import="com.mycompany.entity.Todolist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show_Task</title>
</head>
<body>

<%
  Todolist td=(Todolist) request.getAttribute("list");
  
%>
<h1>Task Details</h1>

Idno:<%=td.getT_msg() %>
</body>
</html>