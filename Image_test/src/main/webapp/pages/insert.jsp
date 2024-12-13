<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert </title>
</head>
<body>
    <h1>Upload Image</h1>
    <form action="/insert1" method="POST" enctype="multipart/form-data">
     <label for="i_name">Image id: </label>
        <input type="text" name="i_id" id="i_id" required><br><br>
    
        <label for="i_name">Image Name: </label>
        <input type="text" name="i_name" id="i_name" required><br><br>

        <label for="file">Select Image: </label>
        <input type="file" name="file" id="file" required><br><br>

        <button type="submit">Upload</button>
    </form>
</body>
</html>
