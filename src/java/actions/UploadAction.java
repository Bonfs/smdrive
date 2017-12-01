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
    //public static final String BASEROOT = "/home/aluno/Documentos/rootDic";
    public static final String BASEROOT = "C:\\Users\\mathe\\Documents\\rootDic";
    
    private File uf;
    private String fileUploadContentType;
    private String fileUploadName, cPath;
    
    @Override
    public String execute()  {        
        try {
            File newFile = new File(BASEROOT+"\\"+uf.getName());
            FileUtils.copyFile(uf, newFile);
        } catch (IOException ex) {
            Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
            return "error";
        }
        return "success";
    }   

    public File getUf() {
        return uf;
    }

    public void setUf(File uf) {
        this.uf = uf;
    }
    
    

    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }
    
    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath;
    }     
    
    
    
}
