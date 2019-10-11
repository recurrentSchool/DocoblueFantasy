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
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");

		RegisterLogic bo = new RegisterLogic();

		boolean result = bo.executeRegist(user);

		String message = "";

		if (result == true) {

			message = "登録完了です";

		} else {

			message = "登録に失敗しました";

		}

		//message画面時、更新連打でユーザーが無限生成するためここでセッションの破棄
		session.invalidate();

		request.setAttribute("message", message);

		RequestDispatcher dis = request.getRequestDispatcher("/message.jsp");
		dis.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int admin =Integer.parseInt(request.getParameter("admin"));
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		int billing =Integer.parseInt(request.getParameter("billing"));
		String message = " ";

		System.out.println(admin);
		System.out.println(name);
		System.out.println(pass);
		System.out.println(billing);

		User user = new User(admin,name, pass,billing);

		RegisterLogic bo = new RegisterLogic();

		HttpSession session = request.getSession();
		session.setAttribute("user",user );

		boolean result = bo.executeMatchName(user);

		if (result == true) {

			RequestDispatcher dis = request.getRequestDispatcher("/confimation.jsp");
			dis.forward(request, response);
		}

		else {

			message = "この名前は既に使われています";
			request.setAttribute("message",message );
			RequestDispatcher dis = request.getRequestDispatcher("/registar.jsp");
			dis.forward(request, response);
		}

	}

}
