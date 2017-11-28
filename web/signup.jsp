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
        <title>Sign up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid row" >
            <div class="jumbotron col-md-3 col-md-offset-3" style="width: 50%">
                <div class="row">
                    <div class="col-md-3 col-md-offset-3">
                        <h1>SMDrive</h1>
                    </div>
                </div>
                
                <s:form action="signUpAction">
                    <div class="form-group">
                        <span class="" id="basic-addon1">Name</span>
                        <s:textfield key="name" name="name" type="text" class="form-control" placeholder="Name" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">
                        <span class="" id="basic-addon1">Username</span>
                        <s:textfield key="username" key="username" type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">
                        <span class="" id="basic-addon1">Email</span>
                        <s:textfield key="email" name="email" type="email" class="form-control" placeholder="Email" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">
                        <span class="" id="basic-addon1">Password</span>
                        <s:textfield key="password" name="password" type="password" class="form-control" placeholder="Password" aria-describedby="basic-addon1" />
                    </div>

                    <div class="form-group">
                        <span class="" id="basic-addon1">Confirm Password</span>
                        <s:textfield key="confirmPassword" name="confirmPassword" type="password" class="form-control" placeholder="Confirm Password" aria-describedby="basic-addon1" />
                    </div>
                            <s:submit value="Registrar" type="submit" class="btn btn-success" />
                </s:form>
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>