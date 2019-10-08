package model;

import bean.Boss;
import dao.BossDAO;

public class ContentsBossSelectLogic {

	//取得した名前を参照したボス情報の取得
	public Boss executeSelect(String contentsDetailsName) {

		BossDAO bossDAO = new BossDAO();
		Boss boss = new Boss(contentsDetailsName, 0, 0, null);
		Boss returnBoss = bossDAO.selectDB(boss);

		return returnBoss;

	}

}
