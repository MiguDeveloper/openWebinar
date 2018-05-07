
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Formulario empleado</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <h4>bienvenido, introduzca los detalles del empleado</h4>
        <form:form method="post" action="addEmpleado" modelAttribute="empleadoForm">
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <form:input cssClass="form-control" path="nombre"/>
                <form:errors path="nombre" cssClass="text-danger"></form:errors>
            </div>
            <div class="form-group">
                <label for="id">ID</label>
                <form:input cssClass="form-control" path="id"/>
                <form:errors path="id" cssClass="text-danger"></form:errors>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <form:input cssClass="form-control" path="email"/>
                <form:errors path="email" cssClass="text-danger"></form:errors>
            </div>
            <input class="btn btn-default" type="submit" value="Enviar">
        </form:form>
    </div>
</div>
</body>
</html>
