package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Boss;

public class BossDAO {

	private final String JDBC_URL = "jdbc:mysql://172.16.6.152:3306/docobluefantasy?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "student";
	private final String DB_PASS = "root";

	//接続状態をcloseするための初期化
	private Connection conn = null;
	private PreparedStatement pStmt = null;
	private ResultSet rs = null;

	//ボス情報の登録
	public boolean insertDB(Boss boss) {

		boolean insertBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO BOSS (NAME,ATTACK,HP,SPECIALATTACK) VALUES (?,?,?,?)";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, boss.getName());
			pStmt.setInt(2, boss.getAttack());
			pStmt.setInt(3, boss.getHp());
			pStmt.setString(4, boss.getSpecialAttack());

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

	//ボス情報の取得
	public Boss selectDB(Boss boss) {

		//Selectの結果をボス情報に格納するための変数
		Boss bossResult = null;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT NAME,ATTACK,HP,SPECIALATTACK FROM BOSS WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, boss.getName());

			rs = pStmt.executeQuery();

			if (rs.next()) {

				String name = rs.getString("NAME");
				int attack = rs.getInt("ATTACK");
				int hp = rs.getInt("HP");
				String specialAttack = rs.getString("SPECIALATTACK");

				bossResult = new Boss(name, attack, hp, specialAttack);

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

		return bossResult;

	}

	//ボス情報の削除
	public boolean deleteDB(Boss boss) {

		boolean deleteBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "DELETE FROM BOSS WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, boss.getName());

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

	//ボス情報の上書き
	public boolean updateDB(Boss bossOriginal,Boss bossUpdate) {

		boolean updateBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			StringBuilder sqlWrite = new StringBuilder();

			sqlWrite.append("UPDATE BOSS ");
			sqlWrite.append("SET ");
			sqlWrite.append("NAME = ? ");//1
			sqlWrite.append(",ATTACK = ? ");//2
			sqlWrite.append(",HP = ? ");//3
			sqlWrite.append(",SPECIALATTACK = ? ");//4
			sqlWrite.append("WHERE ");
			sqlWrite.append("NAME = ?");//5

			pStmt = conn.prepareStatement(sqlWrite.toString());
			pStmt.setString(1, bossUpdate.getName());
			pStmt.setInt(2, bossUpdate.getAttack());
			pStmt.setInt(3, bossUpdate.getHp());
			pStmt.setString(4, bossUpdate.getSpecialAttack());
			pStmt.setString(5, bossOriginal.getName());

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
