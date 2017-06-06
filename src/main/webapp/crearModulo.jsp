<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">
        <link href="css/creative.min.css" rel="stylesheet">
        <title>Crea Modulo</title>
    </head>
    <body>
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="bg-primary" class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">Bienvenido</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="page-scroll" href="#emp">Empleados</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#altarh">Contratar</a>
                        </li>
                        <li>
                            <a href="Login">Cerrar Sesión</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <section id="altarh">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">

                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading ">Crear Modulo</h2>
                                <hr>
                            </div>

                        </div>
                        <form action="NuevoModulo" method="POST">

                            <jsp:useBean id="obj" class="com.ipn.spring.dao.DesarrolladorDAO" scope="page"/>
                            <div class="form-group row">
                                <select  name="soption" class="form-control">
                                    <option>Selecciona Desarrollador</option>
                                    <c:forEach var="dev" items="${obj.leerDesarrolladorId(userId)}">
                                        <c:set var="idDev" value="${dev.idDev}" scope="session"/> 
                                        <option>${dev.nombre}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            
                            <div class="form-group row">
                                <label for="example-search-input" class="col-2 col-form-label">Estado</label>	
                                <select name="estado" class="form-control">
                                    <option selected="selected">En proceso</option>
                                    <option>Por terminar</option>
                                    <option>Cancelado</option>
                                </select>
                            </div>

                            <div class="form-group row">
                                <label for="example-datetime-local-input" class="col-2 col-form-label">Fecha Inicial</label>
                                <div class="col-10">
                                    <input class="form-control" name="fini" type="datetime-local" value="2017-08-08T13:45:00" id="example-datetime-local-input">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="example-datetime-local-input" class="col-2 col-form-label">Fecha final</label>
                                <div class="col-10">
                                    <input class="form-control" name="ffin" type="datetime-local" value="2017-08-08T13:46:00" id="example-datetime-local-input">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="example-search-input" class="col-2 col-form-label">Descripción</label>
                                <div class="col-10">
                                    <input class="form-control" name="desc" type="text" placeholder="Ingrese tarea" value="" id="example-search-input" required>
                                </div>
                            </div>

                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <div class="form-group">
                                    <input href="administrador.jsp" type="submit" value="Crear" class="btn btn-primary btn-xl page-scroll">
                                    <a href="administrador.jsp" class="btn btn-primary btn-xl page-scroll">volver</a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>

        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
        <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
        <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>
        <script src="js/creative.min.js"></script>
    </body>
</html>
