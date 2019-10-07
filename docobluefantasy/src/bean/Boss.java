package bean;

public class Boss {
	private String name;
	private int attack;
	private int hp;
	private String specialAttack;

	public Boss(String name,int attack,int hp,String specialAttack){

		this.name = name;
		this.attack = attack;
		this.hp = hp;
		this.specialAttack = specialAttack;

	}

	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getHp() {
		return hp;
	}

	public String getSpecialAttack() {
		return specialAttack;
	}

}
