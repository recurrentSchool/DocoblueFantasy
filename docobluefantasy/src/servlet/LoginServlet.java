package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import model.LoginLogic;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}//doGET


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		User user = new User(name, pass);

		LoginLogic bo = new LoginLogic();

		boolean result = bo.executeLogin(user);

		HttpSession session = request.getSession();
		session.setAttribute("user",user );

		if (result == true) {
			//loginResult.jspへフォワード
			RequestDispatcher dis = request.getRequestDispatcher("/main.jsp");
			dis.forward(request, response);
		}
		else {
			response.sendRedirect("/login.jsp");
		}

	}//doPOST

}
