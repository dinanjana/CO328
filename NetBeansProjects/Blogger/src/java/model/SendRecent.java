/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import control.filehandlers.RecentBlogs;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dinanajana
 */
public class SendRecent extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        RecentBlogs rb = new RecentBlogs();
        
        PrintWriter out = response.getWriter();
        out.println(rb.recentBlogs.toString());
        System.out.println(rb.recentBlogs.toString()+ "aaaa");
    
    }
    
}
