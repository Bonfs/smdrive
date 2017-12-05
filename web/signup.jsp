<%-- 
    Document   : signup
    Created on : 21/11/2017, 17:08:50
    Author     : aluno
--%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Cadastro</title>
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
                <div id="errorMsgSignUp" class="hidden alert alert-danger" role="alert">Usuário ou senha inválidos!!!</div>
                <s:form id="signUpForm" action="signUpAction">
                    <div class="form-group">                        
                        <s:textfield id="nameSignUp" key="Nome" name="name" type="text" class="form-control" placeholder="Nome" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">                        
                        <s:textfield id="usernameSignUp" key="Usuário" name="username" type="text" class="form-control" placeholder="Usuário" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">                        
                        <s:textfield id="emailSignUp" key="Email" name="email" type="email" class="form-control" placeholder="Email" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">                        
                        <s:textfield id="passwordSignUp" key="Senha" name="password" type="password" class="form-control" placeholder="Senha" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">                        
                        <s:textfield id="confirmPassSignUp" key="Confirme a senha" name="confirmPassword" type="password" class="form-control" placeholder="Confirme a senha" aria-describedby="basic-addon1" />
                    </div>
                        <!--<s:submit value="Registrar" type="submit" class="btn btn-success" />-->
                </s:form>
                </br>
                <div class="row">
                    <button id="btnSignUp" type="button" class="btn btn-success">Registrar</button>
                </div>
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
