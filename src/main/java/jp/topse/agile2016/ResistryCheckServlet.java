package jp.topse.agile2016;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResistryCheckServlet extends HttpServlet {

    private static final long serialVersionUID = 6961400581681209885L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String weight_string = request.getParameter("weight");
    	
    	int weight = -1;
    	String error_message = "";
    	try {
    		weight = checkWeight(weight_string);
    	} catch(Exception e) {
    		error_message = "入力が不正です。";
    	}
    	
    	request.setAttribute("error_message", error_message);
    	request.setAttribute("weight", String.valueOf(weight));
    	
    	request.getRequestDispatcher("resistry_check.jsp").forward(request, response);
    }
    
    private int checkWeight(String weight_string)
    {
    	return 60;
    }
}
