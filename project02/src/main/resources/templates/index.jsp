<!DOCTYPE html>
<html lang="en" xmlns="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Hello World of Spring</h1>

    Student Name : <h2 th:text="${para.studentName}"></h2>
    <a href="showForm">This is for showForm Page</a>
</body>
</html>