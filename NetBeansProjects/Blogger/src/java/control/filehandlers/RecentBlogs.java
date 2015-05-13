/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control.filehandlers;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Dinanajana
 */
public class RecentBlogs {
    
    public ArrayList recentBlogs = new ArrayList<>();
    
    public RecentBlogs(){
    
        fill();
    }
    
    public String showRecent(){
     
        String result="";
        
     if(recentBlogs.size()>10){
         
         for(int i = 0 ; i < 9 ; i++){
             
             result = "<input type =\"submit\" name =\"blog\" value="+
                     recentBlogs.remove(0).toString().split("\\.")[0]+">"
                     + "<input type =\"hidden\" name =\"User\" value=\"\"><br>"+result; 
         }
         
         
     }
     else{
         
         for(int i = 0 ; i < recentBlogs.size() ; i++){
         
                result = recentBlogs.remove(0)+"<br>"+result;
         }
     
     }
        return result;
    
    }
    
    public final void fill(){
        
        FileHandler reviewed;
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\refferredContent\\";
        File folder = new File(URL);
        File[] listOfFiles = folder.listFiles();
        
        
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                
                String fileName = listOfFiles[i].getName();
                System.out.println("File recentBlogs" + fileName);
                recentBlogs.add(fileName);
                
            } else if (listOfFiles[i].isDirectory()) {
        
            System.out.println("Directory " + listOfFiles[i].getName());
            
            }
            
        }
    
    }
    
}
