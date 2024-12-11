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
  StudentInfo sf=(StudentInfo) request.getAttribute("studentInfo");


%>

 <h1>Update Student</h1>
    <form action="/update2" method="post">
        <input type="hidden" name="rollno" value=<%= sf.getRollno() %>>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value=<%=sf.getName() %> required><br>

        <label for="per">Percentage:</label>
        <input type="text" id="per" name="per" value=<%= sf.getPer() %> required><br>

        <input type="submit" value="Save Changes">
    </form>
</body>
</body>
</html>