package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Weapon;

public class WeaponDAO {

	private final String JDBC_URL = "jdbc:mysql://172.16.6.152:3306/docobluefantasy?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "student";
	private final String DB_PASS = "root";

	//接続状態をcloseするための初期化
	private Connection conn = null;
	private PreparedStatement pStmt = null;
	private ResultSet rs = null;

	//武器情報の登録
	public boolean insertDB(Weapon weapon) {

		boolean insertBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO WEAPON (NAME,ATTACK,SKILL) VALUES (?,?,?)";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, weapon.getName());
			pStmt.setInt(2, weapon.getAttack());
			pStmt.setString(3, weapon.getSkill());

			int propriety = pStmt.executeUpdate();

			//登録が完了出来た時、trueが返る
			if (propriety == 0) {

				insertBool = false;

			} else {

				insertBool = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();
			return false;

			//closeする
		} finally {
			if (rs != null) {
				try {

					rs.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pStmt != null) {
				try {

					pStmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return insertBool;

	}

	//武器情報の取得
	public Weapon selectDB(Weapon weapon) {

		//Selectの結果を武器情報に格納するための変数
		Weapon weaponResult = null;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT NAME,ATTACK,SKILL FROM WEAPON WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, weapon.getName());

			rs = pStmt.executeQuery();

			if (rs.next()) {

				String name = rs.getString("NAME");
				int attack = rs.getInt("ATTACK");
				String skill = rs.getString("SKILL");

				weaponResult = new Weapon(name, attack, skill);

			}

		} catch (SQLException e) {

			e.printStackTrace();

			//closeする
		} finally {
			if (rs != null) {
				try {

					rs.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pStmt != null) {
				try {

					pStmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return weaponResult;

	}

	//武器情報のランダム取得
	public List<Weapon> selectRandomDB() {

		//ランダムに取得したSelectの結果を武器情報に格納するための変数
		List<Weapon> listWeapon = new ArrayList<Weapon>();

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			for (int i = 0; i < 10; i++) {
				String sql = "SELECT * FROM WEAPON ORDER BY rand()";
				pStmt = conn.prepareStatement(sql);

				rs = pStmt.executeQuery();



				while (rs.next()) {

					String name = rs.getString("NAME");
					int attack = rs.getInt("ATTACK");
					String skill = rs.getString("SKILL");

					Weapon weaponResult = new Weapon(name, attack, skill);
					listWeapon.add(weaponResult);
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();

			//closeする
		} finally {
			if (rs != null) {
				try {

					rs.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pStmt != null) {
				try {

					pStmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return listWeapon;

	}

	//武器情報の削除
	public boolean deleteDB(Weapon weapon) {

		boolean deleteBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "DELETE FROM WEAPON WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, weapon.getName());

			int propriety = pStmt.executeUpdate();

			//削除が完了出来た時、trueが返る
			if (propriety == 0) {

				deleteBool = false;

			} else {

				deleteBool = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();
			return false;

			//closeする
		} finally {
			if (rs != null) {
				try {

					rs.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pStmt != null) {
				try {

					pStmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return deleteBool;

	}

	//武器情報の上書き
	public boolean updateDB(Weapon weaponOriginal, Weapon weaponUpdate) {

		boolean updateBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			StringBuilder sqlWrite = new StringBuilder();

			sqlWrite.append("UPDATE WEAPON ");
			sqlWrite.append("SET ");
			sqlWrite.append("NAME = ? ");//1
			sqlWrite.append(",ATTACK = ? ");//2
			sqlWrite.append(",SKILL = ? ");//3
			sqlWrite.append("WHERE ");
			sqlWrite.append("NAME = ?");//4

			pStmt = conn.prepareStatement(sqlWrite.toString());
			pStmt.setString(1, weaponUpdate.getName());
			pStmt.setInt(2, weaponUpdate.getAttack());
			pStmt.setString(3, weaponUpdate.getSkill());
			pStmt.setString(4, weaponOriginal.getName());

			int propriety = pStmt.executeUpdate();

			//削除が完了出来た時、trueが返る
			if (propriety == 0) {

				updateBool = false;

			} else {

				updateBool = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();
			return false;

			//closeする
		} finally {
			if (rs != null) {
				try {

					rs.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pStmt != null) {
				try {

					pStmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return updateBool;

	}

}