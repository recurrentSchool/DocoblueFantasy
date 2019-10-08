package model;

import bean.Character;
import dao.CharacterDAO;

public class ContentsCharacterSelectLogic {

	//取得した名前を参照したキャラクター情報の取得
	public Character executeSelect(String contentsDetailsName) {

		CharacterDAO characterDAO = new CharacterDAO();
		Character character = new Character(contentsDetailsName, null, 0, 0, null, 0);
		Character returnCharacter = characterDAO.selectDB(character);

		return returnCharacter;

	}

}
