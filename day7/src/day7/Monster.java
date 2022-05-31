package day7;

import java.util.Arrays;

public class Monster {
	// 필드
	private int str;
	private int hp;
	private int mp;
	private String type;
	
	final String[] TYPE = {"WATER", "FIRE", "EARITH", "AIP"};

	public Monster() {
		int radomType = (int)(Math.random()*(this.TYPE.length));
		this.type = this.TYPE[radomType];
		System.out.println(this.type + "의 몬스터 생성");
		this.str = 10;
		this.hp = 100;
		this.mp = 200;
	}
	public final int getStr() {
		return str;
	}

	public final void setStr(int str) {
		this.str = str;
	}

	public final int getHp() {
		return hp;
	}

	public final void setHp(int hp) {
		this.hp = hp;
	}

	public final int getMp() {
		return mp;
	}

	public final void setMp(int mp) {
		this.mp = mp;
	}

	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}

	public final String[] getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString() {
		return "Monster [str=" + str + ", hp=" + hp + ", mp=" + mp + ", type=" + type + ", TYPE="
				+ Arrays.toString(TYPE) + "]";
	}

	
}
