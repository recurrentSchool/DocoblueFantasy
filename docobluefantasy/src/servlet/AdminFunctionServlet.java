package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.BattleCharacter;
import bean.Boss;
import bean.Weapon;
import model.AdminBossDateLogic;
import model.AdminCharacterDateLogic;
import model.AdminWeaponDateLogic;
import model.ContentsBossSelectLogic;
import model.ContentsCharacterSelectLogic;
import model.ContentsWeaponSelectLogic;

/**
 * Servlet implementation class AdminFunctionServlet
 */
@WebServlet("/AdminFunctionServlet")
public class AdminFunctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String message = (String) request.getAttribute("message");

		//メッセージをセット
		request.setAttribute("message", message);

		//admin.jspへフォワード
		//RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/admin.jsp");
		//テスト用フォルダ実装
		RequestDispatcher dis = request.getRequestDispatcher("test/admin.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String functionPage = (String) request.getParameter("functionPage");
		String pageMove = (String) request.getParameter("pageMove");

		//フォワード用のurlとメッセージの初期化
		String url = null;
		String message = null;

		session.setAttribute("functionPage", functionPage);

		if (pageMove.equals("confirmation")) {

			String weaponName = (String) request.getParameter("weaponName");
			String weaponAttack = (String) request.getParameter("weaponAttack");
			String weaponSkill = (String) request.getParameter("weaponSkill");
			String characterName = (String) request.getParameter("characterName");
			String characterRarity = (String) request.getParameter("characterRarity");
			String characterAttack = (String) request.getParameter("characterAttack");
			String characterHp = (String) request.getParameter("characterHp");
			String characterSkill = (String) request.getParameter("characterSkill");
			String characterEvaluation = (String) request.getParameter("characterEvaluation");
			String bossName = (String) request.getParameter("bossName");
			String bossAttack = (String) request.getParameter("bossAttack");
			String bossHp = (String) request.getParameter("bossHp");
			String bossSpecialAttack = (String) request.getParameter("bossSpecialAttack");

			//登録時確認画面表示用処理
			if (functionPage.equals("entry")) {

				//武器情報が全て書かれている時
				if (!weaponName.isEmpty() && !weaponAttack.isEmpty() && !weaponSkill.isEmpty()) {

					int weaponAttackInteger = Integer.parseInt(weaponAttack);

					Weapon weapon = new Weapon(weaponName, weaponAttackInteger, weaponSkill);
					request.setAttribute("weapon", weapon);

					//キャラクター情報が全て書かれている時
				} else if (!characterName.isEmpty() && !characterRarity.isEmpty() && !characterAttack.isEmpty()
						&& !characterHp.isEmpty() && !characterSkill.isEmpty() && !characterEvaluation.isEmpty()) {

					int characterAttackInteger = Integer.parseInt(characterAttack);
					int characterHpInteger = Integer.parseInt(characterHp);
					int characterEvaluationInteger = Integer.parseInt(characterEvaluation);

					BattleCharacter character = new BattleCharacter(characterName, characterRarity,
							characterAttackInteger, characterHpInteger,
							characterSkill, characterEvaluationInteger);

					request.setAttribute("character", character);

					//ボス情報が全て書かれている時
				} else if (!bossName.isEmpty() && !bossAttack.isEmpty() && !bossHp.isEmpty()
						&& !bossSpecialAttack.isEmpty()) {

					int bossAttackInteger = Integer.parseInt(bossAttack);
					int bossHpInteger = Integer.parseInt(bossHp);

					Boss boss = new Boss(bossName, bossAttackInteger, bossHpInteger, bossSpecialAttack);

					request.setAttribute("boss", boss);

				}

				url = "test/confirmation_entry.jsp";

			//削除時確認画面表示用処理
			} else if (functionPage.equals("delete")) {

				String contentsSelect = (String) request.getParameter("contentsSelect");
				String deleteName = (String) request.getParameter("deleteName");

				if(contentsSelect.equals("weapon"))  {

					ContentsWeaponSelectLogic cwsl = new ContentsWeaponSelectLogic();

					Weapon weapon = cwsl.executeSelect(deleteName);

					if(weapon != null) {

						request.setAttribute("weapon", weapon);
						url = "test/confirmation_delete.jsp";

					} else {

						message = "該当する武器はありません";
						url = "test/delete.jsp";

					}

				} else if(contentsSelect.equals("character")) {

					ContentsCharacterSelectLogic ccsl = new ContentsCharacterSelectLogic();

					BattleCharacter character = ccsl.executeSelect(deleteName);

					if(character != null) {

						request.setAttribute("character", character);
						url = "test/confirmation_delete.jsp";

					} else {

						message = "該当する武器はありません";
						url = "test/delete.jsp";

					}

				} else if(contentsSelect.equals("boss")) {

					ContentsBossSelectLogic cbsl = new ContentsBossSelectLogic();

					Boss boss = cbsl.executeSelect(deleteName);

					if(boss != null) {

						request.setAttribute("boss", boss);
						url = "test/confirmation_delete.jsp";

					} else {

						message = "該当する武器はありません";
						url = "test/delete.jsp";

					}

				}


				//メッセージの登録
				request.setAttribute("message", message);

			//上書き時確認画面表示用処理
			} else if (functionPage.equals("update")) {

			}

			//loginResult.jspへフォワード
			RequestDispatcher dis = request.getRequestDispatcher(url);
			dis.forward(request, response);

			//各機能の実行
		} else if (pageMove.equals("executeFunction")) {

			//登録機能
			if (functionPage.equals("entry")) {

				String weaponName = (String) request.getParameter("weaponName");
				String characterName = (String) request.getParameter("characterName");
				String bossName = (String) request.getParameter("bossName");

				//武器情報の登録
				if (weaponName != null && !weaponName.isEmpty()) {
					String weaponAttack = (String) request.getParameter("weaponAttack");
					String weaponSkill = (String) request.getParameter("weaponSkill");

					int weaponAttackInteger = Integer.parseInt(weaponAttack);

					Weapon weapon = new Weapon(weaponName,weaponAttackInteger,weaponSkill);

					//DBへ登録
					AdminWeaponDateLogic awdl = new AdminWeaponDateLogic();
					if(awdl.executeInsert(weapon)) {
						message = "登録が完了しました";
					} else {
						message = "登録が失敗しました";
					}

				//キャラクター情報の登録
				} else if (characterName != null && !characterName.isEmpty()) {
					String characterRarity = (String) request.getParameter("characterRarity");
					String characterAttack = (String) request.getParameter("characterAttack");
					String characterHp = (String) request.getParameter("characterHp");
					String characterSkill = (String) request.getParameter("characterSkill");
					String characterEvaluation = (String) request.getParameter("characterEvaluation");

					int characterAttackInteger = Integer.parseInt(characterAttack);
					int characterHpInteger = Integer.parseInt(characterHp);
					int characterEvaluationInteger = Integer.parseInt(characterEvaluation);

					BattleCharacter character = new BattleCharacter(characterName, characterRarity,
							characterAttackInteger, characterHpInteger,
							characterSkill, characterEvaluationInteger);

					//DBへ登録
					AdminCharacterDateLogic acdl = new AdminCharacterDateLogic();
					if(acdl.executeInsert(character)) {
						message = "登録が完了しました";
					} else {
						message = "登録が失敗しました";
					}

				//ボス情報の登録
				} else if (bossName != null && !bossName.isEmpty()) {
					String bossAttack = (String) request.getParameter("bossAttack");
					String bossHp = (String) request.getParameter("bossHp");
					String bossSpecialAttack = (String) request.getParameter("bossSpecialAttack");

					int bossAttackInteger = Integer.parseInt(bossAttack);
					int bossHpInteger = Integer.parseInt(bossHp);

					Boss boss = new Boss(bossName, bossAttackInteger, bossHpInteger, bossSpecialAttack);

					//DBへ登録
					AdminBossDateLogic abdl = new AdminBossDateLogic();
					if(abdl.executeInsert(boss)) {
						message = "登録が完了しました";
					} else {
						message = "登録が失敗しました";
					}

				}

			//削除機能
			} else if (functionPage.equals("delete")) {

				String weaponName = (String) request.getParameter("weaponName");
				String characterName = (String) request.getParameter("characterName");
				String bossName = (String) request.getParameter("bossName");

				//削除の可否
				boolean deletePropriety = false;

				//武器情報の削除
				if(weaponName != null && !weaponName.isEmpty()) {

					Weapon weapon = new Weapon(weaponName, 0, null);

					AdminWeaponDateLogic awdl = new AdminWeaponDateLogic();
					deletePropriety = awdl.executeDelete(weapon);

					if(deletePropriety == true) {

						message = "削除が完了しました";

					} else {

						message = "削除に失敗しました";

					}
				//キャラクター情報の削除
				} else if (characterName != null && !characterName.isEmpty()) {

					BattleCharacter character = new BattleCharacter(characterName, null, 0, 0, null, 0);

					AdminCharacterDateLogic acdl = new AdminCharacterDateLogic();
					deletePropriety = acdl.executeDelete(character);

					if(deletePropriety == true) {

						message = "削除が完了しました";

					} else {

						message = "削除に失敗しました";

					}
				//ボス情報の削除
				} else if (bossName != null && !bossName.isEmpty()) {

					Boss boss = new Boss(bossName, 0, 0, null);

					AdminBossDateLogic abdl = new AdminBossDateLogic();
					deletePropriety = abdl.executeDelete(boss);

					if(deletePropriety == true) {

						message = "削除が完了しました";

					} else {

						message = "削除に失敗しました";

					}

				}

			} else if (functionPage.equals("update")) {

			}

			//メッセージの登録
			request.setAttribute("message", message);

			//admin.jspへフォワード
			RequestDispatcher dis = request.getRequestDispatcher("test/admin.jsp");
			dis.forward(request, response);

		}

	}

}
