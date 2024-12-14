<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Todolist</title>
</head>
<body>
    <h1>Insert Todolist</h1>
    <form action="in1" method="post" enctype="multipart/form-data">
         <input type="text" name="t_id"  required/><br><br>
        <input type="text" name="t_name"  required/><br><br>
      
       <input type="text" name="t_msg"  required><br><br>


                <input type="file" name="file"  required/><br><br>

        <input type="submit" value ="submit"/>
    </form>
</body>
</html>
