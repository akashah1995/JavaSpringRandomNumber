package com.codingdojo.greatnumbergame.controllers;
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Submit
 */
@WebServlet("/Submit")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hey");
		
		String color;
		String closeness;
		HttpSession session = request.getSession();
		int guess = Integer.parseInt(request.getParameter("guess"));
			
			if (guess == (int) session.getAttribute("Number")) {
				closeness = "You Guessed Correct!";
				session.setAttribute("Closeness", closeness);
				color = "green";
				session.setAttribute("Color", color);
			}
			
			else if (guess > (int) session.getAttribute("Number")) {
				closeness = "Too High!";
				color = "red";
				session.setAttribute("Closeness",closeness);
				session.setAttribute("Color", color);
			}
			
			else if (guess < (int) session.getAttribute("Number")) {
				closeness = "Too Low!";
				color = "red";
				session.setAttribute("Closeness",closeness);
				session.setAttribute("Color", color);
			}
			
			request.getRequestDispatcher("/Home").forward(request,response);
			
	}

}
