<%@page import="java.util.Base64"%>
<%@page import="com.mycompany.entity.Todolist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Tasks</title>
</head>
<body>
<%
    Iterable<Todolist> li = (Iterable<Todolist>) request.getAttribute("list");
    for (Todolist td : li) {
        byte[] imageBytes = td.getT_img();
        String base64Image = "";
        if (imageBytes != null) {
            base64Image = Base64.getEncoder().encodeToString(imageBytes); // Convert image to Base64 string
        }
%>
    <div>
        <p>ID: <%= td.getT_no() %></p>
        <p>Name: <%= td.getT_name() %></p>
        <p>Message: <%= td.getT_msg() %></p>
        <p>Image: 
            <% if (!base64Image.isEmpty()) { %>
                <img src="data:image/jpeg;base64,<%= base64Image %>" alt="Image not found" width="200"/>
            <% } else { %>
                No image available
            <% } %>
        </p>
    </div>
<% } %>
</body>
</html>
