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

        
        <section id="emp">          
            <div class="container">

                <h2 class="section-heading">Estos son tus empleados</h2>
                <hr>
                <jsp:useBean id="obj" class="com.ipn.spring.dao.UserDAO" scope="page"/> 
                <div class="container">
                    <table class="table">
                        <thead>
                            <tr scope="row">
                                <td>Id</td>
                                <td>Director</td>
                                <td>Cargo</td>
                                <td>Nombre</td>
                                <td>Password</td>
                                <td>Apellido Paterno</td>
                                <td>Apellido Materno</td>
                                <td>Email</td>
                                <td>Telefono</td>
                                <td>Salario</td>
                                <td>Actualiza</td>
                                <td>Despide</td>
                            </tr>
                        </thead>
                       
                        <c:forEach items="${obj.leerEmpleados(userId)}" var="deve">
                            <tbody>
                                <tr scope="row">
                                    <td> ${deve.idEmp}</td>
                                    <td> ${usermail}</td>
                                    <td> ${deve.cargo}</td>
                                    <td> ${deve.nom}</td>
                                    <td> ${deve.pass}</td>
                                    <td> ${deve.ap}</td>
                                    <td> ${deve.am}</td>
                                    <td> ${deve.mail}</td>
                                    <td> ${deve.tel}</td>
                                    <td> ${deve.sal}</td>
                                    <td><a href="AltaEquipo?action=edit&idxx=<c:out value="${deve.getIdEmp()}"/>&idAdmin=${userId}"><span class="glyphicon glyphicon-pencil"></span></a></td>
                                    <td><a href="AltaEquipo?action=delete&idxx=<c:out value="${deve.getIdEmp()}"/>"><span class="glyphicon glyphicon-remove"></span></a></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </section>
                
        <section id="altarh">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">

                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading">Contratar</h2>
                                <hr>
                            </div>

                        </div>
                        <form action="Cont" method="POST">
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <select class="form-control" name="cargo">
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
                                    <input type="text" name="nom" class="form-control"  placeholder="Nombre" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="pass" class="form-control"  placeholder="Asignale contraseña" required>
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
                                    <input type="email" name="mail" class="form-control"  placeholder="Correo" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="tel" name="tel" class="form-control"  placeholder="Telefono" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="sal" class="form-control"  placeholder="Salario" required>
                                </div>
                            </div>
                         
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <div class="form-group">
                                    <input href="crearEquipo.jsp" type="submit" value="Crear" class="btn btn-primary btn-xl page-scroll">
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
