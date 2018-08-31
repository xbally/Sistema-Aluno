<%-- 
    Document   : Cadastro
    Created on : Aug 30, 2018, 9:27:46 AM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    </head>
    <body>
             <div class="container">
            <div class="jumbotron">
            <h1>Cadastro Aluno</h1>
            </div>
       <form class="form-horizontal"  action="CadastroUsuario" method="POST">
           <div class="form-group">
            <label class="control-label">CPF</label>
             <input type="text" class="form-control  col-sm-3" name="CPF" value=""><br>
            Nome <input type="text" class="form-control col-sm-7 " name="nome" value=""><br>
           
            <div class="form-group">
            Data matricula  <input type="date" class ="form-control col-sm-2" name="dataMatricula" value="">
               
            Data Nascimento <input type="date" class ="form-control col-sm-2" name="dataNascimento" value="">
            </div>
            Filiacao<input type="text" class="form-control col-sm-7" name="filiacao" value=""><br>
            <div class="jumbotron">        
            <h1>Dados Curso</h1>
            </div>
            Nome do curso<input type="text" class="form-control col-sm-3"  name="nomedocurso" value=""><br>
            
            Data de Inicio <input type="date" class="form-control col-sm-2"  name="dataInicio" value=""><br>
            
            Nivel<br>
            <select name="nivel" class="custom-select mb-3 col-sm-2">
            <option selected>Nivel</option>
            <option  value="1">1</option>
            <option  value="2">2</option>
            <option  value="3">3</option>
                </select>
            <div class="jumbotron">
            <h1>Dados Disciplina</h1>
            </div>
            Nome da Disciplina <input type="text" class="form-control  col-sm-7 " name="nomeDisciplina" value=""><br>
            Carga Horaria <input type="text" class="form-control col-sm-2" name="cargaHoraria" value=""><br>
            Ementa <textarea type="text" class="form-control" name="ementa" value=""></textarea>
           </div>
		   
		   
            <input type="submit" value= "Cadastrar Aluno">
            
            <a class="btn btn-info" role="button"  href="ListarServlet" >Verificar</a> 
            
     

        </form><br><br>
           </div>
    </body>
</html>
