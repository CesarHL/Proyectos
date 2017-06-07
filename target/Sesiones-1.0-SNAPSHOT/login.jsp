<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Inicia sesión</title>
    </head>
    <body>
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="bg-primary" class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="login.jsp">APSI</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="page-scroll" href="crearCuenta.jsp">Registrate</a>
                        </li>                        
                    </ul>
                </div>
            </div>
        </nav>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
        <section id="login">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">

                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading">Crea nuevos proyectos</h2>
                                <hr class="primary">
                            </div>
                        </div>

                        <div class="panel-body" id="l">
                            <div class="row">
                                <div class="col-lg-12">

                                    <form id="login-form" action="Login" method="POST">
                                        ${message}
                                        <div class="form-group">
                                            <input type="email" name="usermail" id="username" tabindex="1"
                                                   class="form-control" placeholder="Nombre" required>
                                        </div>

                                        <div class="form-group">
                                            <input type="password" name="pass" id="password"
                                                   tabindex="2" class="form-control" placeholder="Contraseña" required>
                                        </div>

                                        <div class="col-lg-8 col-lg-offset-2 text-center">
                                            <div class="form-group">
                                                <input type="submit" value="ingresar" class="btn btn-primary btn-xl page-scroll">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="text-center">
                                                        <a href="crearCuenta.jsp" tabindex="5"
                                                           class="forgot-password">No tienes una cuenta?</a>
                                                           <a href="index.jsp" tabindex="5"
                                                           class="forgot-password">regresar menú principal</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
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
