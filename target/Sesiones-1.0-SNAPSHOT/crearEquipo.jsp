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
        <title>Administra personal</title>
    </head>
    <body>
        <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
            <div class="container-fluid">
                <div class="navbar-header">

                    <a class="navbar-brand page-scroll" href="administrador.jsp">Home</a>
                </div>
            </div>
        </nav>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" name="busqueda" type="text" placeholder="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
                </div>
                <jsp:useBean id="obj" class="com.ipn.spring.dao.DesarrolladorDAO" scope="page"/>
                <div class="container">
                    <table class="table">
                        <thead>
                            <tr scope="row">
                                <td>Id Usuario</td>
                                <td>Cargo</td>
                                <td>Competencia</td>
                                <td>Nombre</td>
                                <td>Apellido Paterno</td>
                                <td>Apellido Materno</td>
                                <td>Email</td>
                                <td>Telefono</td>
                                <td>Salario</td>
                                <td>Acciones</td>
                            </tr>
                        </thead>
                        <c:forEach items="${obj.leerDesarrolladores()}" var="deve">
                            <tbody>
                                <tr scope="row">
                                    <td> ${deve.idDesarrollador}</td>
                                    <td> ${deve.cargo}</td>
                                    <td> ${deve.competencia}</td>
                                    <td> ${deve.nombre}</td>
                                    <td> ${deve.ap}</td>
                                    <td> ${deve.am}</td>
                                    <td> ${deve.email}</td>
                                    <td> ${deve.tel}</td>
                                    <td> ${deve.salario}</td>
                                    <td> <span class="glyphicon glyphicon-pencil"></span></td>
                                    <td> <span class="glyphicon glyphicon-remove"></span></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
        </section>
        <section id="altarh">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">

                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading">Alta recursos humanos</h2>
                                <hr>
                            </div>

                        </div>
                        <form action="AltaEquipo" method="POST">

                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <select class="form-control" name="jobs">
                                        <option value="defatult">Selecciona una opción</option>
                                        <option value="pm">Project Mannager</option>
                                        <option value="dev">Desarrollador</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="competencia" class="form-control"  placeholder="Competencia: Android developer, Java developer..." required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="nombre" class="form-control"  placeholder="Nombre" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="ap" class="form-control"  placeholder="Apellido Paterno" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="am" class="form-control"  placeholder="Apellido Materno" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="mail" name="correo" class="form-control"  placeholder="Correo" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="tel" name="telefono" class="form-control"  placeholder="Telefono" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="salario" class="form-control"  placeholder="Salario" required>
                                </div>
                            </div>

                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <div class="form-group">
                                    <input type="submit" value="Registrar" class="btn btn-primary btn-xl page-scroll">
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
