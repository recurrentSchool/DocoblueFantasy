package model;

import bean.Weapon;
import dao.WeaponDAO;

public class ContentsWeaponSelectLogic {

	//取得した名前を参照した武器情報の取得
	public Weapon executeSelect(String contentsDetailsName) {

		WeaponDAO weaponDAO = new WeaponDAO();
		Weapon weapon = new Weapon(contentsDetailsName, 0, null);
		Weapon returnWeapon = weaponDAO.selectDB(weapon);

		return returnWeapon;

	}

}
