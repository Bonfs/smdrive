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
    </head>
    <body>
        <div class="container-fluid row" >
            <div class="jumbotron col-md-3 col-md-offset-3" style="width: 50%">
                <div class="row">
                    <div class="col-md-3 col-md-offset-3">
                        <h1>SMDrive</h1>
                    </div>
                </div>
                <s:form action="loginAction">
                    <div class="form-group">
                        <s:textfield key="usuario" name="usuario" class="form-control" placeholder="Username" aria-describedby="basic-addon1" />
                    </div>
                    <div class="form-group">
                        <s:textfield key="password" name="password" type="password" class="form-control" placeholder="Password" aria-describedby="basic-addon1" />
                    </div>
                    
                    <s:submit value="Sign in" type="submit" class="btn btn-success"/>
                    <!--<a class="btn btn-success" href="root.html">Sign in</a>-->
                    
                </s:form>
                    <a class="btn btn-info" href="signup.jsp">Sign up</a>
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
