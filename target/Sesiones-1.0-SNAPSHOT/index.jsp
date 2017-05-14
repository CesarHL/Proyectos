<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Crea Nuevos Proyectos</title>

        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">
        <link href="css/creative.min.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">Bienvenido</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <a class="page-scroll" href="#register">Registrate</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#about">Home</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#services">Servicios</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#portfolio">Portafolio</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#contact">Contacto</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#login">Ingresa</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <header id="register">
            <div class="header-content">
                <div class="col-md-9 col-sm-9">
                    <div class="header-content-inner">
                        <h1 id="homeHeading">Crea nuevos proyectos de forma gratuita</h1>
                        <hr>
                        <p>Start Bootstrap can help you build better websites using the Bootstrap CSS framework! Just download your template and start going, no strings attached!</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3">
                    <div class="div-trans text-center">
                        <h3>Registrate </h3>
                        <form action="CrearUsuario" method="POST">
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="nombre" class="form-control"  placeholder="Nombre">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="text" name="ap" class="form-control"  placeholder="Apellido">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="email" name="email" class="form-control"  placeholder="Correo">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="password" name="pass" class="form-control"  placeholder="Contraseña">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="password" name="cpass" class="form-control"  placeholder="Verifica Contraseña">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <select class="form-control" name="jobs">
                                        <option value="defatult">Selecciona una opción</option>
                                        <option value="admin">Administrador</option>
                                        <option value="pm">Project Mannager</option>
                                        <option value="developer">Desarrollador</option>
                                    </select>
                                </div>
                            </div>

                            <div class="col-md-12 col-sm-12">
                                <div class="form-group">
                                    <input type="submit" value="Registrarse" class="btn btn-primary btn-xl page-scroll">
                                </div>
                            </div>
                        </form>
                    </div> 
                </div>
            </div>
        </header>

        <section class="bg-primary" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Tenemos exactamente lo que necesitas!</h2>
                        <hr class="light">
                        <p class="text-faded">Start Bootstrap has everything you need to get your new website up and running in no time! All of the templates and themes on Start Bootstrap are open source, free to download, and easy to use. No strings attached!</p>
                        <a href="#services" class="page-scroll btn btn-default btn-xl sr-button">Empecemos!</a>
                    </div>
                </div>
            </div>
        </section>

        <section id="services">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading">A Tu Servicio</h2>
                        <hr class="primary">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="service-box">
                            <i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
                            <h3>Sturdy Templates</h3>
                            <p class="text-muted">Our templates are updated regularly so they don't break.</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="service-box">
                            <i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i>
                            <h3>Ready to Ship</h3>
                            <p class="text-muted">You can use this theme as is, or you can make changes!</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="service-box">
                            <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
                            <h3>Up to Date</h3>
                            <p class="text-muted">We update dependencies to keep things fresh.</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="service-box">
                            <i class="fa fa-4x fa-heart text-primary sr-icons"></i>
                            <h3>Made with Love</h3>
                            <p class="text-muted">You have to make your websites with love these days!</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="no-padding" id="portfolio">
            <div class="container-fluid">
                <div class="row no-gutter popup-gallery">
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/1.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/1.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/2.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/2.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/3.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/3.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/4.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/4.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/5.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/5.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a href="img/portfolio/fullsize/6.jpg" class="portfolio-box">
                            <img src="img/portfolio/thumbnails/6.jpg" class="img-responsive" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </section>

        <section id="contact">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2 text-center">
                        <h2 class="section-heading">Ponte en contacto!</h2>
                        <hr class="primary">
                        <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>
                    </div>
                    <div class="col-lg-4 col-lg-offset-2 text-center">
                        <i class="fa fa-phone fa-3x sr-contact"></i>
                        <p>55-7331-6482</p>
                    </div>
                    <div class="col-lg-4 text-center">
                        <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                        <p><a href="mailto:your-email@your-domain.com">cesar.herlop@yahoo.com.mx</a></p>
                    </div>
                </div>
            </div>
        </section>

        <section id="login">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">

                        <div class="panel-heading">
                            <div class="col-lg-8 col-lg-offset-2 text-center">
                                <h2 class="section-heading">Creemos nuevos proyectos</h2>
                                <hr class="primary">
                            </div>
                        </div>

                        <div class="panel-body" id="l">
                            <div class="row">
                                <div class="col-lg-12">

                                    <form id="login-form" action="Login" method="POST">

                                        <div class="form-group">
                                            <input type="text" name="usermail" id="username" tabindex="1"
                                                   class="form-control" placeholder="Nombre" value="">
                                        </div>

                                        <div class="form-group">
                                            <input type="password" name="pass" id="password"
                                                   tabindex="2" class="form-control" placeholder="Contraseña">
                                        </div>

                                        <div class="form-group text-center">
                                            <input type="checkbox" tabindex="3" class="" name="remember"
                                                   id="remember"> <label for="remember">
                                                Recordarme</label>
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
                                                        <a href="" tabindex="5"
                                                           class="forgot-password">Olvidaste tu contraseña?</a>
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

