package com.MVC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyMVC
 */
@WebServlet("/MyMVC")
public class MyMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	
		User us = new User();
		us.setUsername(username);
		us.setPassword(password);
		
		if(us.check()) {
			RequestDispatcher rs = request.getRequestDispatcher("WelcomePage");
			rs.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			response.getWriter().print("<h1>Login Faild!</h1>");
			RequestDispatcher rs = request.getRequestDispatcher("Singup.jsp");
			rs.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
