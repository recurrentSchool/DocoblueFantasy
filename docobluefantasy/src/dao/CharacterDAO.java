package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.BattleCharacter;

public class CharacterDAO {

	private final String JDBC_URL = "jdbc:mysql://172.16.6.152:3306/docobluefantasy?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "student";
	private final String DB_PASS = "root";

	//接続状態をcloseするための初期化
	private Connection conn = null;
	private PreparedStatement pStmt = null;
	private ResultSet rs = null;

	//キャラクター情報の登録
	public boolean insertDB(BattleCharacter character) {

		boolean insertBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO BATTLECHARACTER (NAME,RARITY,ATTACK,HP,SKILL,EVALUATION) VALUES (?,?,?,?,?,?)";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, character.getName());
			pStmt.setString(2, character.getRarity());
			pStmt.setInt(3, character.getAttack());
			pStmt.setInt(4, character.getHp());
			pStmt.setString(5, character.getSkill());
			pStmt.setInt(6, character.getEvaluation());

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

	//キャラクター情報の取得
	public BattleCharacter selectDB(BattleCharacter character) {

		//Selectの結果をキャラクター情報に格納するための変数
		BattleCharacter characterResult = null;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT NAME,RARITY,ATTACK,HP,SKILL,EVALUATION FROM BATTLECHARACTER WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, character.getName());

			rs = pStmt.executeQuery();

			if (rs.next()) {

				String name = rs.getString("NAME");
				String rarity = rs.getString("RARITY");
				int attack = rs.getInt("ATTACK");
				int hp = rs.getInt("HP");
				String skill = rs.getString("SKILL");
				int evalution = rs.getInt("EVALUATION");

				characterResult = new BattleCharacter(name,rarity,attack,hp,skill,evalution);

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

		return characterResult;

	}

	//キャラクター情報の削除
	public boolean deleteDB(BattleCharacter character) {

		boolean deleteBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "DELETE FROM BATTLECHARACTER WHERE NAME = ?";
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, character.getName());

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

	//キャラクター情報の上書き
	public boolean updateDB(BattleCharacter characterOriginal,BattleCharacter characterUpdate) {

		boolean updateBool = false;

		try {

			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			StringBuilder sqlWrite = new StringBuilder();

			sqlWrite.append("UPDATE BATTLECHARACTER ");
			sqlWrite.append("SET ");
			sqlWrite.append("NAME = ? ");//1
			sqlWrite.append(",RARITY = ? ");//2
			sqlWrite.append(",ATTACK = ? ");//3
			sqlWrite.append(",HP = ? ");//4
			sqlWrite.append(",SKILL = ? ");//5
			sqlWrite.append(",EVALUATION = ? ");//6
			sqlWrite.append("WHERE ");
			sqlWrite.append("NAME = ?");//7

			pStmt = conn.prepareStatement(sqlWrite.toString());
			pStmt.setString(1, characterUpdate.getName());
			pStmt.setString(2, characterUpdate.getRarity());
			pStmt.setInt(3, characterUpdate.getAttack());
			pStmt.setInt(4, characterUpdate.getHp());
			pStmt.setString(5, characterUpdate.getSkill());
			pStmt.setInt(6, characterUpdate.getEvaluation());
			pStmt.setString(7, characterOriginal.getName());

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
