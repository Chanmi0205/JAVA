package test;

public class Test01 {
	public static void main(String[] args) {

		// Kevin
		System.out.println("======Chan======");
		Creature Chan = new Kevin(0, 0 ,10);
		Chan.attack();
		((Kevin) Chan).talk();
		((Kevin) Chan).coding();
		((Kevin)Chan).swimDown(-30);
		System.out.println("================");
		
		// Turtile
		System.out.println("======cucu======");
		Creature cucu = new Turtle(0, 100 , 20);
		cucu.attack();
		((Turtle)cucu).swimDown(10);
		System.out.println("================");
		
		//Pigeon 
		System.out.println("======koko======");
		Creature koko = new Pigeon(100, 0 , 30);
		koko.attack();
		((Pigeon)koko).flyMove(10, 10);
		((Pigeon)koko).fly(10);
		System.out.println("================");
		
//		Human Chanmi = new Kevin();
//		((Kevin) Chanmi).coding();
//		System.out.println(Chanmi.y);
//		Chanmi.swimDown(Chanmi);
//		System.out.println(Chanmi.y);
		
	}
}
