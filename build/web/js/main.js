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
});
