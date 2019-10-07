package bean;

public class Character {

	private String name;
	private String rarity;
	private int attack;
	private int hp;
	private String skill;
	private int evalution;

	Character(String name,String rarity,int attack,int hp,String skill,int evalution){

		this.name = name;
		this.rarity = rarity;
		this.attack = attack;
		this.hp = hp;
		this.skill = skill;
		this.evalution = evalution;

	}

	public String getName() {
		return name;
	}

	public String getRarity() {
		return rarity;
	}

	public int getAttack() {
		return attack;
	}

	public int getHp() {
		return hp;
	}

	public String getSkill() {
		return skill;
	}

	public int getEvalution() {
		return evalution;
	}

}
