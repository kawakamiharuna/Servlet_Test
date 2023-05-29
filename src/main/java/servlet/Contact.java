package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String info = request.getParameter("info");
		String[] magazin = request.getParameterValues("magazin");
		String tool = request.getParameter("tool");
		Page.header(out);
		
		
		if(name.length() == 0){
			out.println("必須項目を入力してください。");
		}
		else if(mail.length() == 0) {
			out.println("必須項目を入力してください。");
		}
		else if(info.length() == 0) {
			out.println("必須項目を入力してください。");
		}else {
			out.println("<p>お名前「" + name + "」様</p>");
			out.println("<p>会社名「" + company +"」</p>");
			out.println("<p>メールアドレス「" + mail +"」</p>");
			out.println("<p>お問い合わせ内容「" + info + "」</p>");
			
			if(magazin != null){
				out.println("メルマガの種類");	
				for(String mag : magazin) {
					out.println("「" + mag +"」");	
				}
			
			}
			
			if(Integer.parseInt(tool)== 1) {
				out.println("<p>この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロード可能です。</p>");
				out.println("<a href ='http://localhost:8080/ServletTest/jsp/siryou.jsp'>リンク</a>");
			} else {
				out.println("<p>資料請求希望なし</p>");	
			}
			
		}

		
		Page.footer(out);
		
		
		
		
	}

}
