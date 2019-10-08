package model;

import bean.User;
import dao.UserDAO;

public class RegisterLogic {

	//会員登録
	public boolean executeRegist(User user) {

		boolean propriety = false;

		UserDAO userDAO = new UserDAO();

		//ネームとパスが一致した時trueを返す
		if (userDAO.insertDB(user)) {
			propriety = true;
		} else {
			propriety = false;
		}

		return propriety;

	}

	//ネーム重複確認
	public boolean executeMatchName(User user) {

		boolean propriety = false;

		UserDAO userDAO = new UserDAO();

		//ネームとパスが一致した時trueを返す
		if (userDAO.matchNameDB(user)) {
			propriety = true;
		} else {
			propriety = false;
		}

		return propriety;
	}

}