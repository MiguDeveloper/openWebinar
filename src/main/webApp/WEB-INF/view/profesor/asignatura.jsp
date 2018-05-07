<%--
  Created by IntelliJ IDEA.
  User: miguelchinchay
  Date: 10/04/18
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Detalle asignatura</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<br><br>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">Detalle del profesor: ${asignatura.titulo}</div>
        <div class="panel-body">
            <ul>
                <li>${asignatura.id}</li>
                <li>${asignatura.numHoras}</li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
