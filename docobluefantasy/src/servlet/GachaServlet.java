package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Weapon;
import model.GachaLogic;

@WebServlet("/GachaServlet")
public class GachaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		GachaLogic gachalogic = new GachaLogic();
		List<Weapon> listWeapon = gachalogic.executeGetWeapon();

		request.setAttribute("listWeapon", listWeapon);

		RequestDispatcher dis = request.getRequestDispatcher("/gacha_result.jsp");
		dis.forward(request, response);


	}

}
