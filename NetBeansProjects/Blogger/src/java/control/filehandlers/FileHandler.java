/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control.filehandlers;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 *
 * @author Dinanajana
 */
public class FileHandler {
    
    public String URL;
    public String content ="";
   
    
    
    
    
    public FileHandler(String URL) {
        
        this.URL = URL;
        
    }
    
    /*public void FileWriter(String content){
    //String s = "Hello World! ";
        byte data[] = content.getBytes();
        Path p = Paths.get(URL);//("./logfile.txt");

        try (OutputStream out = new BufferedOutputStream(
        Files.newOutputStream(p, CREATE, APPEND))) {
            
            out.write(data, 0, data.length);
        
        } catch (IOException x) {
          
            System.err.println(x);
        }
  
    }*/
    
    public void FileWriter(){
    //String s = "Hello World! ";
        byte data[] = content.getBytes();
        Path p = Paths.get(URL);//("./logfile.txt");

        try (OutputStream out = new BufferedOutputStream(
        Files.newOutputStream(p, CREATE, APPEND))) {
            
            out.write(data, 0, data.length);
            System.out.println(content);
        
        } catch (IOException x) {
          
            System.err.println(x);
        }
  
    }
    
    public void FileWriter(String URL){
    //String s = "Hello World! ";
        byte data[] = content.getBytes();
        Path p = Paths.get(URL);//("./logfile.txt");

        try (OutputStream out = new BufferedOutputStream(
        Files.newOutputStream(p, CREATE, APPEND))) {
            
            out.write(data, 0, data.length);
            System.out.println(content);
        
        } catch (IOException x) {
          
            System.err.println(x);
        }
  
    }
    
    public void FileReader(){
        
        String fileName = URL;

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                content = content +"\n"+ line ;
                
            }    

            // Always close files.
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    
    
    }
    
    public void FileReader(String URL){
        
        String fileName = URL;

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                content = content +"\n" +line ;
                
            }    

            // Always close files.
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    
    
    }
    
    
    public void deleteContent(String URL){
    try{
 
    		File file = new File(URL);
 
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
 
    	}catch(Exception e){
 
    		e.printStackTrace();
 
    	}
    
    }
    
    public void copyFile(String a,String b){
        
        FileReader(a);
        FileWriter(b);
    
        
    
    
    }
    
}
