package sBox;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SuggestionServlet extends HttpServlet 
{

	String[] names = {"Abbot", "Abraham","Adam","Adrian","Barack","Babara","Barney","Becky","Calvin","Camilia","Charley","Chuck","Daniel","Daisy","Damien","Dean"};	//array containing the names which would be displayed as suggestions

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		response.addHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = response.getWriter();		
		
		String typed = request.getParameter("userInput").toLowerCase();			//getting the parameter which was sent by the client
		Pattern inputPattern = Pattern.compile("^"+typed + ".*");				//create a Pattern object according to the user input
		Matcher match;
                //String res = null;
		int found = 0;	
                
            for (String name : names) {
                match = inputPattern.matcher(name.toLowerCase());
                if (match.matches()) {
                    found ++ ;
                    out.println(name + " " );
                    //res = res +", " + name;
                    
                }
            }
            
            if(found < 1 )  out.println( "No results were found");
		
		//compare each name in the names array with the user input pattern and when a matching name is found send that in the response
            //res = res + " " +found;
				
            //out.println(res);
	}
	
}	