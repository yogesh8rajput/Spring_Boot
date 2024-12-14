<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Upload Image</h1>
    <form action="/image1" method="POST" enctype="multipart/form-data">
     <label for="s_id">Image id: </label>
        <input type="text" name="s_id" id="s_id" required><br><br>
    
        <label for="s_name">Image Name: </label>
        <input type="text" name="s_name" id="s_name" required><br><br>

        <label for="file">Select Image: </label>
        <input type="file" name="file" id="file" required><br><br>

        <input type="submit"  value="submit">
    </form>
</body>
</html>