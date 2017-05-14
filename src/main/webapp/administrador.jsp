<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE>

<html>
    <header>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </header>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>Lista de Proyectos</title>
    </head>
    <body class="container">

        <p><a href="CrearProyecto.jsp"><span class=" glyphicon glyphicon-plus"></span>Agregar nuevo proyecto</a></p>
        <p><a href="UserController?action=insert"><span class="glyphicon glyphicon-book"></span>Historial de proyectos</a></p>
        <p><a href="UserController?action=insert"><span class="glyphicon glyphicon-signal"></span>Mostrar reporte</a></p>
        <p><a href="UserController?action=insert"><span class="glyphicon glyphicon-user"></span>Administrar personal</a></p>
        <header>
            <h1>Lista proyectos</h1>
        </header>
        <table class ="table table-striped">
            <thead>
                <tr>
                    <th>Nombre Proyecto</th>
                    <th>Lider</th>
                    <th>Presupuesto Asignado</th>
                    <th>Fecha Limite</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>proyecto1</td>
                    <td>Juan</td>
                    <td>1000</td>
                    <td>04/07/1994</td>
                    <td><a href=""><span class="glyphicon glyphicon-pencil"></span></a></td>
                    <td><a href=""><span class="glyphicon glyphicon-remove"></span></a></td>
                    <td><a href=""><span class="glyphicon glyphicon-envelope"></span></a></td>
                    <td><a href=""><span class="glyphicon glyphicon-tasks"></span></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <section class="container">
        <article>
            <header>
                <h1>Crea un proyecto</h1>
            </header>
            <div >
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="" method="post" role="form">

                                        <div class="form-group row">
                                            <label for="example-search-input" class="col-2 col-form-label">Nombre</label>
                                            <div class="col-10">
                                                <input class="form-control" name="nombreProyecto" type="search" placeholder="ingrese nombre" value="" id="example-search-input">
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <label for="example-search-input" class="col-2 col-form-label">Lider</label>	
                                            <select class="form-control">
                                                <option>Default select</option>
                                                <option>Default select</option>
                                                <option>Default select</option>
                                                <option>Default select</option>
                                            </select>
                                        </div>

                                        <div class="form-group row">
                                            <label for="example-search-input" class="col-2 col-form-label">Presupuesto</label>
                                            <div class="col-10">
                                                <input class="form-control" name="presupuestoProyecto" type="search" placeholder="$ ingrese presupuesto" value="" id="example-search-input">
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <label for="example-datetime-local-input" class="col-2 col-form-label">Fecha final</label>
                                            <div class="col-10">
                                                <input class="form-control" name="fechaFinalProyecto" type="datetime-local" value="2011-08-19T13:45:00" id="example-datetime-local-input">
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
                                            <button type="button" class="btn btn-success">Enviar</button>
                                        </div>
                                    </form>
                                </div>					

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </article>
    </section>

</body>
</html>