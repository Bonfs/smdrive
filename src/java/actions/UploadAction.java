/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author bonfim
 */
public class UploadAction extends ActionSupport{
    public static final String BASEROOT = "/home/aluno/Documentos/rootDic";
    
    public File fileUpload;
    public String fileUploadContentType;
    public String fileUploadName, filePath;
    
    @Override
    public String execute() throws Exception {
        if(filePath == null){
            filePath = BASEROOT;
        }
        File newFile = new File(filePath, fileUpload.getName());
        FileUtils.copyFile(fileUpload, newFile);
        return "success";
    }

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    
    
    
}
