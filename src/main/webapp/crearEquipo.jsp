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
        <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
            <div class="container-fluid">
                <div class="navbar-header">

                    <a class="navbar-brand page-scroll" href="index.jsp">Home</a>
                </div>
            </div>
        </nav>
        <section id="registrate">
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
