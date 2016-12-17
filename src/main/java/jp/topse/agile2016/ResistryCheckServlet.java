package jp.topse.agile2016;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResistryCheckServlet extends HttpServlet {

    private static final long serialVersionUID = 6961400581681209885L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String weight_string = request.getParameter("weight");
    	
    	String error_message = "";
    	if(checkWeight(weight_string)){
    		// データベース登録
    	}
    	else{
    		error_message = "入力が不正です。";
    	}    	
    	request.setAttribute("error_message", error_message);
    	request.setAttribute("weight", weight_string);
    	
    	request.getRequestDispatcher("resistry_check.jsp").forward(request, response);
    }
    
    private boolean checkWeight(String weight_string)
    {
    	Pattern p = Pattern.compile("^[1-9][0-9]{0,2}(\\.[0-9])?$");
    	Matcher m = p.matcher(weight_string);
    	return m.find();
    }
}
