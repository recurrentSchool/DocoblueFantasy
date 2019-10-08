package model;

import java.util.ArrayList;
import java.util.List;

import bean.Weapon;
import dao.WeaponDAO;

//動作未確認
public class GachaLogic {

	//武器情報を10件取得
	public List<Weapon> executeGetWeapon(){

		List<Weapon> listWeapon = new ArrayList<Weapon>();

		WeaponDAO weaponDAO = new WeaponDAO();
		listWeapon = weaponDAO.selectRandomDB();

		return listWeapon;

	}

}
