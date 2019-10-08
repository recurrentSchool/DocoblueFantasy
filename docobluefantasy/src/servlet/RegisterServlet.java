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
import model.RegisterLogic;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int admin =Integer.parseInt(request.getParameter("admin"));
		String name = request.getParameter("");
		String pass = request.getParameter("");
		int billing =Integer.parseInt(request.getParameter("billing"));

		User user = new User(admin,name, pass,billing);

		RegisterLogic bo = new RegisterLogic();

		HttpSession session = request.getSession();
		session.setAttribute("user",user );

		boolean result = bo.executeRegister(user);

		if (result == true) {
			RequestDispatcher dis = request.getRequestDispatcher("/confimation.jsp");
			dis.forward(request, response);
		}

		else {
			response.sendRedirect("/register.jsp");
		}

	}

}
