<%@page import="java.util.Base64"%>

<%@page import="com.mycompany.entity.Image"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Show All Images</title>
</head>
<body>
    <h1>All Uploaded Images</h1>
    <%
    Iterable<Image> li = (Iterable<Image>) request.getAttribute("images");
    for (Image i : li) {
        byte[] imageBytes = i.getI_img();
        String base64Image = "";
        if (imageBytes != null) {
            base64Image = Base64.getEncoder().encodeToString(imageBytes); // Convert image to Base64 string
        }
%>
    <div>
        <p>ID: <%= i.getI_id() %></p>
        <p>Name: <%= i.getI_name() %></p>
        <p>Message: <%= i.getI_img() %></p>
        <p>Image: 
            <% if (!base64Image.isEmpty()) { %>
                <img src="data:image/jpg;base64,<%= base64Image %>" alt="Image not found" width="200"/>
            <% } else { %>
                No image available
            <% } %>
        </p>
    </div>
<% } %>
</body>
</html>
    