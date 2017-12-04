/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    //console.log('ready');
    $("#newDirectory").click(function(){
        var directoryName = prompt("Qual o nome da nova da pasta?");
        //console.log(directoryName.length);
        //TODO validar o nome do diretório
        if(directoryName.length > 0 && directoryName != null){
            //window.location="newDirectory.action?newDirectory="+directoryName;
            $("#newDirectoryName").val(directoryName);
            document.forms.newDirectoryForm.submit();

        }
    });
    
    $("#uploadFile").change(function(){
        console.log('hshshs');
        if($("#uploadFile").val() != null){
            document.forms.uploadForm.submit();
        }
        
    });
    
    $("#btnSignIn").click(function(){
       var user = $("#userSignin").val();
       var password = $("#passwordSignin").val();
       console.log(password.length);
       
       if(user.length == 0 || password.length == 0){
           //console.log($("#errorMsgLogin").text());
           $("#errorMsgLogin").text("Todos os Campos devem ser preenchidos!!!");
           $("#errorMsgLogin").removeClass("hidden");
       } else if(user.length < 4){
           $("#errorMsgLogin").text("Login muito curto");
           $("#errorMsgLogin").removeClass("hidden");
       } else if(password.length < 4){
           $("#errorMsgLogin").text("Senha muito curta");
           $("#errorMsgLogin").removeClass("hidden");
       }  else{
           $("#errorMsgLogin").addClass("hidden");
           document.forms.loginForm.submit();
       }
    });
    
    $("#btnSignUp").click(function(){
       var name = $("#nameSignUp").val();
       var user = $("#usernameSignUp").val();
       var email = $("#emailSignUp").val();
       var password = $("#passwordSignUp").val();
       var confirmPassword = $("#confirmPassSignUp").val();
       var emailRegex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
       console.log(user.length);
       
       if(name.length == 0 || user.length == 0 || email.length == 0 || password.length == 0 || confirmPassword.length == 0){
           $("#errorMsgSignUp").text("Todos os Campos devem ser preenchidos!!!").removeClass("hidden");
       } else if(name.length < 3){
           $("#errorMsgSignUp").text("Nome muito curto, ele deve conter pelo menos 4 caracteres.").removeClass("hidden");
       } else if(user.length < 4){
           $("#errorMsgSignUp").text("Login muito curto, ele deve conter pelo menos 4 caracteres.").removeClass("hidden");
       } else if(!emailRegex.test(email)){
           $("#errorMsgSignUp").text("Email inválido.").removeClass("hidden");
       } else if(password.length < 4){
           $("#errorMsgSignUp").text("Senha muito curta").removeClass("hidden");
       } else if(password != confirmPassword){
           $("#errorMsgSignUp").text("O campo de Senha e Confirmar Senha devem ser iguais.").removeClass("hidden");
       } else{
           $("#errorMsgSignUp").addClass("hidden");
           document.forms.signUpForm.submit();
       }
       
    });
});
