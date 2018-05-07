
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista de profesores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Seminario</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lstProfesores}" var="profesor">
                    <tr>
                        <td>${profesor.id}</td>
                        <td><a href="./detail/${profesor.id}">${profesor.nombre}</a></td>
                        <td>${profesor.seminario}</td>
                        <td>${profesor.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
