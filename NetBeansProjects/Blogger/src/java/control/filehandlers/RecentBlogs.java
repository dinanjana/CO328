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
    
    public void addRecent(String fileName){
        
        if(recentBlogs.size() < 11){
        
            recentBlogs.add(fileName) ;
        
        }else{
        
            recentBlogs.remove(0);
            recentBlogs.add(fileName);
            
        }
    
    }
    
    public final void fill(){
        
        FileHandler reviewed;
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\refferredContent\\";
        File folder = new File(URL);
        File[] listOfFiles = folder.listFiles();
        
        
        for (int i = 0; i < 11; i++) {
            if (listOfFiles[i].isFile()) {
                
                String fileName = listOfFiles[i].getName();
                System.out.println("File xxxx" + fileName);
                addRecent(fileName);
                
            } else if (listOfFiles[i].isDirectory()) {
        
            System.out.println("Directory " + listOfFiles[i].getName());
            
            }
            
        }
    
    }
    
}
