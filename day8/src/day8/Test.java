package day8;

import submit.Movie;

public class Test {
	public static void main(String[] args) {
		// 추상 클래스이기 때문에 오류가 발생함
//		Animal a = new Animal();
//		a.say();
		
//		Movie m1 = new Movie();
		Animal c = new Cat();
		c.say();
		((Cat) c).nightSee();
		c.test();
		
		Animal d = new Dog();
		d.say();
		
//		Pet cutedong = new Dog();
//		cutedong.say();
		
		Animal c1 = new Cat("»ï»öÀÌ");
		Animal d2 = new Dog("´©··ÀÌ");
		
		c.attack(d2);
		
	}

}
