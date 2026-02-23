package com.fahim.oops;

abstract class Bird{
	abstract void eats();
	abstract void fly();
}

abstract class Eagle extends Bird{
	abstract void eats();
	void fly() {
		System.out.println("Eagle flies at greater heights");
	}
}

class SerpentEagle extends Eagle{
	@Override
	void eats() {
		System.out.println("Serpent eagle eats Snakes and Reptiles");
	}
	
}

class GoldenEagle extends Eagle{
	void eats() {
		System.out.println("Golden eagle eats mammals or fishes");
	}
}

class Sky{
	public void EagleFamily(Eagle e){
		e.fly();
		e.eats();
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		Sky s = new Sky();
		
		s.EagleFamily(se);
		
		System.out.println();
		
		s.EagleFamily(ge);
		
		
		
//		Eagle e;
//		e = new SerpentEagle();
//		e.eats();
//		e.fly();
//		
//		System.out.println();
//		
//		e= new GoldenEagle();
//		e.eats();
//		e.fly();
	
		
//		SerpentEagle se = new SerpentEagle();
//		GoldenEagle ge = new GoldenEagle();
//		
//		se.fly();
//		se.eats();
//		
//		System.out.println();
//		
//		ge.fly();
//		ge.eats();
	}

}

