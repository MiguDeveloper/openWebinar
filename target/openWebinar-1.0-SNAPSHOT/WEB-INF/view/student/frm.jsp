
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Formulario Student</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <h4>Bienvenido, introduzca los detalles del estudiante</h4>
        <form:form method="post" action="${not empty op ? '../edit' : 'addStudent'}" modelAttribute="studentForm">
            <div class="form-group">
                <label for="nombres">Nombre</label>
                <form:input cssClass="form-control" path="nombres"/>
                <form:hidden path="id"></form:hidden>
                <form:errors path="nombres" cssClass="text-danger"></form:errors>
            </div>
            <div class="form-group">
                <label for="apellidos">Apellidos</label>
                <form:input cssClass="form-control" path="apellidos"/>
                <form:errors path="apellidos" cssClass="text-danger"></form:errors>
            </div>

            <input class="btn btn-default" type="submit" value="Enviar">
        </form:form>
    </div>
</div>
</body>
</html>