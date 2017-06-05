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
                    <a class="navbar-brand page-scroll" href="index.jsp">Bienvenido</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="page-scroll" href="login.jsp">Login</a>
                        </li>                        
                    </ul>
                </div>
            </div>
        </nav>
        <section id="registrate">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading">Registrate</h2>
                                <hr class="primary">
                            </div>
                        </div>
                        <form action="CrearUsuario" method="POST">
                            ${message2}
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="competencia" class="form-control"  placeholder="Competencia" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="nom" class="form-control"  placeholder="Nombre" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="ap" class="form-control"  placeholder="Apellido paterno" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="am" class="form-control"  placeholder="Apellido materno" required>
                                </div>
                            </div>
                            
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="email" name="mail" class="form-control"  placeholder="Correo" autocomplete="off" required>
                                </div>
                            </div>
                            
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="password" name="pass" class="form-control"  placeholder="Contraseña" autocomplete="off" required>
                                </div>
                            </div>
                            
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="tel" class="form-control"  placeholder="Teléfono" required>
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="sal" class="form-control"  placeholder="Asignate un salario" required>
                                </div>
                            </div>
                            

                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <div class="form-group">
                                    <input type="submit" value="Registrarse" class="btn btn-primary btn-xl page-scroll">
                                    <a href="index.jsp" class="btn btn-primary btn-xl page-scroll">volver</a>
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
