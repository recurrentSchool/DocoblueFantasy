package model;

import bean.BattleCharacter;
import dao.CharacterDAO;

public class ContentsCharacterSelectLogic {

	//取得した名前を参照したキャラクター情報の取得
	public BattleCharacter executeSelect(String contentsDetailsName) {

		CharacterDAO characterDAO = new CharacterDAO();
		BattleCharacter character = new BattleCharacter(contentsDetailsName, null, 0, 0, null, 0);
		BattleCharacter returnCharacter = characterDAO.selectDB(character);

		return returnCharacter;

	}

}
