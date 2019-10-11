package model;

import java.util.ArrayList;
import java.util.List;

import bean.Weapon;
import dao.WeaponDAO;

//動作未確認
public class GachaLogic {

	public static void main(String[] args) {

		Weapon weapon = new Weapon(null,0,null);

		WeaponDAO weaponDAO = new WeaponDAO();

		List<Weapon> lw = weaponDAO.selectRandomDB();

		System.out.println(lw.get(0).getName());
	}

	//武器情報を10件取得
	public List<Weapon> executeGetWeapon(){

		List<Weapon> listWeapon = new ArrayList<Weapon>();

		WeaponDAO weaponDAO = new WeaponDAO();
		listWeapon = weaponDAO.selectRandomDB();

		return listWeapon;

	}

}
