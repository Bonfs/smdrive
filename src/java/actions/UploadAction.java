/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author bonfim
 */
public class UploadAction extends ActionSupport{
    //public static final String BASEROOT = "C:\\Users\\mathe\\Documents\\rootDic";
    
    public File fileUpload;
    public String fileUploadContentType;
    public String fileUploadFileName, cPath;
    
    @Override
    public String execute() {        
        String filePath = "/home/aluno/";
        File fileToCreate = new File(filePath, getFileUploadFileName());
        try {
            FileUtils.copyFile(fileUpload, fileToCreate);
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
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

    public String getFileUploadFileName() {
        return fileUploadFileName;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
        this.fileUploadFileName = fileUploadFileName;
    }
   
    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath;
    }
}
