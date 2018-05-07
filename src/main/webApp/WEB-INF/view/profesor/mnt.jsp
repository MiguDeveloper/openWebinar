
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Detalle profesor</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <br><br>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading">Detalle del profesor: ${profesor.nombre}</div>
            <div class="panel-body">
                <ul>
                    <li>${profesor.id}</li>
                    <li>${profesor.nombre}</li>
                    <li>${profesor.seminario}</li>
                    <li>${profesor.email}</li>
                    <ul>
                        <c:forEach items="${profesor.lstAsignaturas}" var="asignatura">
                            <li><a href="./${profesor.id}/curso/${asignatura.id}">${asignatura.titulo}</a></li>
                        </c:forEach>
                    </ul>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
