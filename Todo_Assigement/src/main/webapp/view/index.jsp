<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Todolist</title>
</head>
<body>
    <h1>Upload Image</h1>
    <form action="/insert1" method="POST" enctype="multipart/form-data">
     <label for="c_name">Image id: </label>
        <input type="text" name="c_id" id="c_id" required><br><br>
    
        <label for="c_name">Image Name: </label>
        <input type="text" name="c_name" id="c_name" required><br><br>

        <label for="file">Select Image: </label>
        <input type="file" name="file" id="file" required><br><br>

        <button type="submit">Upload</button>
    </form>
</body>
</html>
