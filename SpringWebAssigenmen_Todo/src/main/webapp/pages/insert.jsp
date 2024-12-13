<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Todolist</title>
</head>
<body>
    <h1>Insert Todolist</h1>
    <form action="insert1" method="POST" enctype="multipart/form-data">
        <label for="t_name">Task Name: </label>
        <input type="text" name="t_name" id="t_name" required><br><br>
 <label for="t_name">Task id: </label>
        <input type="text" name="t_id" id="t_id" required><br><br>

        <label for="file">Upload Image: </label>
        <input type="file" name="file" id="file" required><br><br>

        <button type="submit">Upload</button>
    </form>
</body>
</html>
