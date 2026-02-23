package com.fahim.oops;

class Heart {
	private int weight;
	private int BPM;
	
	public Heart(int weight, int BPM) {
		this.weight = weight;
		this.BPM = BPM;
	}
	
	public int getWeight() {
		return weight;
	}

	public int getBPM() {
		return BPM;
	}

	public void setBPM(int BPM) {
		this.BPM = BPM;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}

class Brain{
	private int weight;
	private String color;
	public Brain(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Bike{
	private String brand;
	private int milage;
	
	public Bike(String brand, int milage) {
		this.brand = brand;
		this.milage = milage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getMilage() {
		return milage;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMilage(int milage) {
		this.milage = milage;
	}
}

class Book{
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.author= author;
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}

class Human{
	Heart heart = new Heart(250, 82);
	Brain brain = new Brain(1400, "Grey");
	
	void hasABike(Bike bike) {
		System.out.println(bike.getBrand());
		System.out.println(bike.getMilage());
	}
	
	void hasABook(Book book) {
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		
	}
}

public class AggregationAndCompositionDemo {
	public static void main(String[] args) {
		Human human = new Human();
		Bike bike = new Bike("honda", 25);
		Book book = new Book("Java", "James Gosling");
		
		System.out.println(human.heart.getBPM());
		System.out.println(human.heart.getWeight());
		System.out.println("========");
		
		System.out.println(human.brain.getColor());
		System.out.println(human.brain.getWeight());
		System.out.println("========");
		
		human.hasABike(bike);
		System.out.println("========");
		human.hasABook(book);
		System.out.println("========");
		
		//HUMAN DIED, NO ACCESS TO BRAIN AND HEART
		human = null;
//		System.out.println(human.heart.getBPM());
//		System.out.println(human.heart.getWeight());
//		System.out.println(human.brain.getColor());
//		System.out.println(human.brain.getWeight());
		
		
		
		//HUMAN DIED BUT STILL HAVE ACCESS TO BIKE AND BOOK
		System.out.println(bike.getBrand());
		System.out.println(bike.getMilage());
		System.out.println("========");
		
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
	}
	
	
	
}

