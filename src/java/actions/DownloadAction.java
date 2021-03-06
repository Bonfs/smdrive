/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author bonfim
 */
public class DownloadAction extends ActionSupport{
    public String fileName;
    public String filePath;
    public InputStream inputStream;
    
    @Override
    public String execute() throws Exception {
        if(filePath != null){
            File f = new File(filePath);
            setFileName(f.getName());
            inputStream = new FileInputStream(f);
            return "success";
        }
        return "error";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    
    
}
