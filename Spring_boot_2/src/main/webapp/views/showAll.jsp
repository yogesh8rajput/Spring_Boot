<%@page import="com.mycompany.entity.StudentInfo"%>
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
   Iterable<StudentInfo> li=(Iterable<StudentInfo>)request.getAttribute("list");
   for(StudentInfo sd : li)
   {
	 %>  
	  
	  id:<%= sd.getName() %>
	  <% 
   }
%>
</body>
</html>