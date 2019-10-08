package bean;

public class BattleCharacter {

	private String name;
	private String rarity;
	private int attack;
	private int hp;
	private String skill;
	private int evaluation;

	public BattleCharacter(String name,String rarity,int attack,int hp,String skill,int evaluation){

		this.name = name;
		this.rarity = rarity;
		this.attack = attack;
		this.hp = hp;
		this.skill = skill;
		this.evaluation = evaluation;

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

	public int getEvaluation() {
		return evaluation;
	}

}
