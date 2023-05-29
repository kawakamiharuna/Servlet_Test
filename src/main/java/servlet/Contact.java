package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/servlet/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String magazin = request.getParameter("magazin");
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String info = request.getParameter("info");
		
		
		
		request.setAttribute("name", name);
		request.setAttribute("company", company);
		request.setAttribute("mail", mail);
		request.setAttribute("inquiry", magazin);
		
		
		

		
				try {
					String tool = request.getParameter("tool");
					if (tool.equals("yes")) {
						request.getRequestDispatcher("../jsp/yes.jsp")
								.include(request, response);
					} else {
						request.getRequestDispatcher("../jsp/no.jsp")
								.include(request, response);
					}
				} catch (Exception e) {
					System.out.println("もう一度やり直してください。");
				}}
			

		}

	

