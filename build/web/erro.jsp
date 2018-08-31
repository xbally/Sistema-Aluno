<%-- 
    Document   : erro
    Created on : Aug 31, 2018, 8:40:42 AM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="erro" class="Beans.ErroBean" scope="request"/>
        <jsp:setProperty name="erro" property="*"/>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4 alert alert-danger" role="alert">
                <p><jsp:getProperty name="erro" property="msg"/></p>
            </div>
        </div>
        <a class="btn btn-outline-secondary" href="<jsp:getProperty name="erro" property="page"/>">Voltar para a tela de Inicial</a>
          <jsp:useBean id="configuracao" class="Beans.ConfigBean" scope="application"/>
            <footer class="page-footer font-small teal pt-4">
            Em caso de problemas contate o administrador: <jsp:getProperty name="configuracao" property="email"/>
        </footer>
    </body>
</html>
