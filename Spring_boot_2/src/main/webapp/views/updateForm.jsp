<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Student</title>
</head>
<body>
    <h1>Update Student</h1>
    <form action="/upp" method="post">
        <input type="hidden" name="rollno" value="${studentInfo.rollno}">

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${studentInfo.name}" required><br>

        <label for="per">Percentage:</label>
        <input type="text" id="per" name="per" value="${studentInfo.per}" required><br>

        <input type="submit" value="Save Changes">
    </form>
</body>
</html>
