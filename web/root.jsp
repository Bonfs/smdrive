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
                        <li>
                            <s:form id="uploadForm" action="upload" method="POST" enctype="multipart/form-data">
                                <s:file key="fileUpload" name="fileUpload" label="Load File" size="20" id="uploadFile"></s:file>
                                <s:hidden key="cPath" name="cPath" value="%{cPath}" ></s:hidden>
                            </s:form>
                        </li>
                      <li role="separator" class="divider"></li>
                      <li id="newDirectory">
                          <a href="#">Create Directory</a>
                          <form id="newDirectoryForm" action="newDirectory" method="POST">
                              <s:hidden key="newDirectoryName" name="newDirectoryName" />
                              <s:hidden key="cPath" name="cPath" value="%{cPath}" ></s:hidden>
                          </form>
                      </li>
                    </ul>
                  </li>
                </ul>
                  
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User <span class="caret"></span></a>
                      <ul class="dropdown-menu">
                            <li>
                                <s:url action="editUser" var="editUser" value="editUser"></s:url>
                                <a href="${editUser}">Editar Perfil</a>
                            </li>
                            <li>
                                <s:url action="logout" var="logout" value="logout"></s:url>
                                <a href="${logout}">Deslogar</a>
                            </li>
                      </ul>
                    </li>
                </ul>
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        
        <s:property value="user" />
        <s:if test="newDirectoryError">
            <div id="errorpermissionDeniedError" class="alert alert-danger" role="alert">Você deve estar logado para acessar essa funcionalidade!</div>
        </s:if>
        <s:if test="getSessionMap().get(\"login\")">
            <p>usuário logado</p>
        </s:if>
        
        <div class="container-fluid">
           <ol class="breadcrumb">
                <li>
                    <s:url action="root" var="root" value="root" >
                        
                    </s:url>
                    <a href="${root}">root</a>
                </li>
                <li><a href="#">subdirectory</a></li>
            </ol>
            
            <s:if test="files.size() > 0">
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
                          <s:iterator value="files" var="f">
                              <tr>
                                  <td></td>
                                  <s:if test="#f.isDirectory()">
                                      <td>
                                          <s:url action="root" var="nextDirectory">
                                              <s:param name="fileName"><s:property value="#f.getName()" /></s:param>
                                              <s:param name="cPath"><s:property value="#f.getAbsolutePath()" /></s:param>
                                          </s:url>
                                          /<a href="${nextDirectory}"><s:property value="#f.getName()" /></a>
                                      </td>
                                  </s:if>
                                  <s:else>
                                      <s:url action="download" var="downloadParams">
                                          <s:param name="filePath"><s:property value="#f.getAbsolutePath()" /></s:param>
                                      </s:url>
                                      <td><a href="${downloadParams}"><s:property value="#f.getName()" /></a></td>
                                  </s:else>
                                  
                                  <td>.png</td>
                                  <td><s:property value="#f.length()" /></td>
                              </tr>
                          </s:iterator>
                      </tbody>
                    </table>
                </div>
            </s:if>
            <s:else>
                <p>Você não tem nenhuma arquivo adicionado!</p>
            </s:else>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
