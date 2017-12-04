<%-- 
    Document   : index
    Created on : 24/10/2017, 17:12:42
    Author     : bonfim
--%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>SMDrive - Drive de Sistemas e Mídias Virtuais</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid row" >
            <div class="jumbotron col-md-3 col-md-offset-3" style="width: 50%">
                <div class="row">
                    <div class="col-md-3 col-md-offset-3">
                        <h1>SMDrive</h1>
                    </div>
                </div>
                <s:if test="error">
                    <div id="errorMsgLogin" class="alert alert-danger" role="alert">Usuário ou senha inválidos!!!</div>
                </s:if>
                <div id="errorMsgLogin" class="hidden alert alert-danger" role="alert">Usuário ou senha inválidos!!!</div>
                <div class="row">
                    <s:form id="loginForm" action="loginAction" method="POST">
                        <div class="form-group">
                            <s:textfield id="userSignin" key="Usuario" name="usuario" class="form-control" placeholder="Login" aria-describedby="basic-addon1" required="required" />
                        </div>
                        <div class="form-group">
                            <s:textfield id="passwordSignin" key="Password" name="password" type="password" class="form-control" placeholder="Senha" aria-describedby="basic-addon1" required="required" />
                        </div>

                        <!--<s:submit value="Sign in" type="submit" class="btn btn-success"/>-->

                        <!--<a class="btn btn-success" href="root.html">Sign in</a>-->

                    </s:form>
                </div>
                </br>
                <div class="row">
                    <button id="btnSignIn" type="button" class="btn btn-success">Logar</button>
                    <a class="btn btn-info" href="signup.jsp">Cadastrar-se</a>
                </div>
                    
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
