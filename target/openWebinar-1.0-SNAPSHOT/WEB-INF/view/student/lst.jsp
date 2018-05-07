
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista de Estudiantes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form class="form-inline" method="post" action="searchStudent">
        <div class="form-group">
            <label for="firstName">First name</label>
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="first name">
        </div>
        <div class="form-group">
            <label for="lastName">Email</label>
            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="last name">
        </div>
        <button type="submit" class="btn btn-default">Buscar</button>
    </form>

    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellidos</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lstStudents}" var="student">
            <tr>
                <td>${student.id}</td>
                <td><a href="/edit/${student.id}">${student.nombres}</a></td>
                <td>${student.apellidos}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>