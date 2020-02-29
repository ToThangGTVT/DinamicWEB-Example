package com.utc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */

public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strName = request.getParameter("username");
		String strPass = request.getParameter("password");
		PrintWriter printWriter = response.getWriter();
		printWriter.append("Xin chào: ").append(strName);
		if ("ahihi".equals(strPass)) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("contentWarning");
			response.setCharacterEncoding("UTF-8");
			request.setAttribute("info", "Thông minh lắm con trai");
			requestDispatcher.forward(request, response);
		} else {
			response.sendRedirect("login");
		}
		
	}

}
