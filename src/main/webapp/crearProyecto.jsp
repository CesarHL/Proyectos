
<%@page import="java.util.List"%>
<%@page import="com.ipn.spring.dao.PMDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">
        <link href="css/creative.min.css" rel="stylesheet">
        <title>Crea un proyecto</title>
    </head>
    <body>
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="bg-primary" class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only"></span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">Bienvenido</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <a class="page-scroll" href="#services">Servicios</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <section class="container">
            <article>

                <div >
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3">
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-12">

                                        <h2 class="section-heading">Aquí puedes crear tu proyecto!</h2>
                                        <hr>
                                        <form id="login-form" action="CrearProyecto" method="post" role="form" style="display: block;">
                                            <div class="form-group row">
                                                <label for="example-search-input" class="col-2 col-form-label">Nombre</label>
                                                <div class="col-10">
                                                    <input class="form-control" name="nombreProyecto" type="search" placeholder="ingrese nombre" value="" id="example-search-input">
                                                </div>
                                            </div>
                                            <jsp:useBean id="obj" class="com.ipn.spring.dao.DesarrolladorDAO" scope="page"/>
                                            <div class="form-group row">
                                                <label for="example-search-input" class="col-2 col-form-label">Lider</label>	
                                                <select class="form-control">
                                                    <c:forEach var="dev" items="${obj.leerDesarrolladores()}">
                                                        <c:if test = "${dev.cargo == 'pm'}">
                                                            <option>${dev.nombre}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </select>
                                            </div>

                                            <div class="form-group row">
                                                <label for="example-datetime-local-input" class="col-2 col-form-label">Fecha Inicial</label>
                                                <div class="col-10">
                                                    <input class="form-control" name="fechaInicialProyecto" type="datetime-local" value="2011-08-19T13:45:00" id="example-datetime-local-input">
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="example-datetime-local-input" class="col-2 col-form-label">Fecha final</label>
                                                <div class="col-10">
                                                    <input class="form-control" name="fechaFinalProyecto" type="datetime-local" value="2011-08-19T13:45:00" id="example-datetime-local-input">
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="example-search-input" class="col-2 col-form-label">Presupuesto</label>
                                                <div class="col-10">
                                                    <input class="form-control" name="presupuestoProyecto" type="search" placeholder="$ ingrese presupuesto" value="" id="example-search-input">
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="example-search-input" class="col-2 col-form-label">Objetivo</label>
                                                <div class="col-10">
                                                    <textarea class="form-control" name="objetivoProyecto" placeholer="ingrese objetivo">
                                                    </textarea>
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <div class="form-group">
                                                    <label for="exampleInputFile">Archivo requerimientos</label>
                                                    <input type="file" name="archivoReq" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
                                                    <small id="fileHelp" class="form-text text-muted">Ingrese un archivo de requerimientos para que el equipo pueda visualizarlo.</small>
                                                </div>
                                            </div>	
                                            <div class="form-group">
                                                <button type="button" class="btn btn-success">Crear</button>
                                            </div>
                                        </form>
                                    </div>					

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </article>
        </section>

        <section id="segundoPaso">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Asigna tareas a tus Project Managers!</h2>
                        <hr>
                        <p>Para continuar asigna tareas presionando el botón</p>
                        <a href="crearEquipo.jsp" class="btn btn-primary btn-xl page-scroll">Asignar Tareas!</a>
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