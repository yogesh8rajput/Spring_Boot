<%@page import="com.mycompany.entity.Todolist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show _All</title>
</head>
<body>
<%
   Iterable<Todolist> li=(Iterable<Todolist>)request.getAttribute("list");
    for(Todolist td:li)
    {
    	%>
    	id:<%=td.getT_no() %>
    	Name<%=td.getT_name() %>
    	MSG<%=td.getT_msg() %>
    	
    {	<% 
    }
%>
</body>
</html>