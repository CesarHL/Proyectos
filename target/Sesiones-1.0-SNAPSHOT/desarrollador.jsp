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
        <title>Bienvenido</title>
    </head>
    <body>
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="bg-primary" class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">Bienvenido ${usermail}</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="Login">Cerrar Sesión</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <jsp:useBean id="obj" class="com.ipn.spring.dao.ModuloDAO" scope="page"/>
        <section  id="tablaProyecto">
            <div class="container">
                <div class="row">
                    <div class="text-center">
                        <h2 class="section-heading">Estas son tus asignaciones!</h2>
                        <hr>
                        <table class ="table table-striped">
                            <thead>
                                <tr>
                                    <th>IdMod</th>
                                    <th>IdPr</th>
                                    <th>IdPm</th>
                                    <th>IdDev</th>
                                    <th>Estado</th>
                                    <th>Nombre</th>
                                    <th>Fecha Inicio</th>
                                    <th>Fecha Limite</th>
                                    <th>Descripción</th>
                                </tr>
                            </thead>

                            <c:forEach items="${obj.leerModulosIdDev(userId)}" var="pr">
                                <tbody>
                                    <tr>
                                        <td>${pr.idModulo}</td>
                                        <td>${pr.idPr}</td>
                                        <td>${pr.idPm}</td>
                                        <td>${pr.idDev}</td>
                                        <td>${pr.nombre}</td>
                                        <td>${pr.estadoMod}</td>
                                        <td>${pr.fechaInicio}</td>
                                        <td>${pr.fechaFin}</td>
                                        <td>${pr.descripcion}</td>
                                    </tr>
                                </tbody>
                            </c:forEach>
                        </table>
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
