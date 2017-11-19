<%-- 
    Document   : root
    Created on : 19/11/2017, 16:59:31
    Author     : bonfs
--%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Root Directory</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">SMDrive</a>
              </div>

              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                  <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">NEW <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="#">Load File</a></li>
                      <li role="separator" class="divider"></li>
                      <li><a href="#">Create Directory</a></li>
                    </ul>
                  </li>
                </ul>
                  
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User <span class="caret"></span></a>
                      <ul class="dropdown-menu">
                        <li><a href="index.html">log off</a></li>
                      </ul>
                    </li>
                </ul>
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="container-fluid">
           <ol class="breadcrumb">
                <li><a href="#">root</a></li>
                <li><a href="#">subdirectory</a></li>
            </ol>
            
            <div class="table-responsive">
                <table class="table">
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>File Name</th>
                      <th>Extension</th>
                      <th>Size</th>
                    </tr>
                  </thead>
                  <tbody>
                      <tr>
                          <td></td>
                          <td>Foto</td>
                          <td>.png</td>
                          <td>2MB</td>
                      </tr>
                      <tr>
                          <td></td>
                          <td>Documentos</td>
                          <td>/</td>
                          <td>10MB</td>
                      </tr>
                      <tr>
                          <td></td>
                          <td>Apostila</td>
                          <td>.pdf</td>
                          <td>0.5MB</td>
                      </tr>
                      <tr>
                          <td></td>
                          <td>foto</td>
                          <td>.psd</td>
                          <td>12MB</td>
                      </tr>
                  </tbody>
                </table>
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
