<%-- 
    Document   : 404
    Created on : Nov 29, 2017, 11:25:01 PM
    Author     : mathe
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New directory</h1>
        <s:form id="newDirectory" action="newDirectory">
            <s:textfield key="newDirectoryName" name="newDirectoryName" class="form-control" placeholder="diretorio" aria-describedby="basic-addon1" />
            <s:hidden key="cPath" name="cPath" value="/home/aluno/Documentos/rootDic/" />
            <s:submit value="criar" type="submit" class="btn btn-success"/>
        </s:form>
    </body>
</html>
