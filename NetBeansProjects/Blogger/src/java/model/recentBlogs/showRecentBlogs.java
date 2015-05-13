/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.recentBlogs;

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
public class showRecentBlogs extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        
        PrintWriter out = response.getWriter();
        
        RecentBlogs rB = new RecentBlogs();
        
        out.println(rB.showRecent());
        
    
    }
}
