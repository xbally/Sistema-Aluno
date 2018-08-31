<%-- 
    Document   : Busca
    Created on : Aug 30, 2018, 9:29:59 AM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="jumbotron text-center">
        <h1>Busca Aluno</h1>
        </div>

        <div class="col-md-3">
        <h2>Buscar</h2>
        </div>
        <div class="col-md-5">
        <div class="input-group h2">
            <input name="buscar" class="form-control" id="search" type="text" placeholder="Buscar Aluno">
            <span class="input-group-btn">
                <a class="btn btn-primary" type="submit">
                    <span class="glyphicon glyphicon-search"></span>
                </a>
            </span>
        </div>
    </div>
        
        </div>
       </body>
</html>
