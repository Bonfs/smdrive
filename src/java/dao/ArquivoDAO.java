/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author mathe
 */
public class ArquivoDAO {
    
    
    public static boolean addDirectory(String path, String directoryName) throws URISyntaxException{
        //URI uri = new URI(path+"\\"+directoryName);
        File directory = new File(path+"/"+directoryName);
        if(!directory.exists()){
            return directory.mkdir();
        } else{
            return false;
        }
    }
    
    public static boolean addFile(String path){
        return true;
    }
}
