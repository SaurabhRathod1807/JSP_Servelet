package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyfirstServlet")
public class MyfirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MyfirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			PrintWriter w = response.getWriter();
			String u=request.getParameter("a");
			String p=request.getParameter("b");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
			
			PreparedStatement st= c.prepareStatement(" select * from logininfo where username=? and password=?;"); 
			st.setString(1, u);
			st.setString(2, p);
			
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
//				w.println("<h1>Lonin Success</h1>");
			RequestDispatcher rd =	request.getRequestDispatcher("/WelcomePage");
			rd.forward(request, response);
			}
			else {
				w.println("<h1>Lonin Failed</h1>");
				w.println("<br><br>");
				RequestDispatcher rd =	request.getRequestDispatcher("/NewLogin.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
