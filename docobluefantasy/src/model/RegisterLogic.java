package model;

import bean.User;
import dao.UserDAO;

public class RegisterLogic {

	public boolean executeRegister(User user) {

		boolean propriety = false;

		UserDAO userDAO = new UserDAO();

		//ネームとパスが一致した時trueを返す
		if(userDAO.matchNameDB(user)) {
			propriety = true;
		} else {
			propriety = false;
		}

		return propriety;

	}

}