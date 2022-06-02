package day8;

import submit.Movie;

public class Test {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.say();
		
//		Movie m1 = new Movie();
		Animal c = new Cat();
		c.say();
		((Cat) c).nightSee();
		c.test();
		
		Animal d = new Dog();
		d.say();
		
//		Pet cutedong = new Dog();
//		cutedong.say();
		
		Animal c1 = new Cat("ªÔªˆ¿Ã");
		Animal d2 = new Dog("¥©∑∑¿Ã");
		
		c.attack(d2);
		
	}

}