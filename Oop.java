package fclass;

import encapsulation.EncapsulationIntro;

public class Oop {
	public static void main(String[] args)
	{
		
		Person p1=new Person(),p2=new Person("Nasima",23);
		p1.name="Bithi";
		p1.age=23;
		System.out.println(p1.name+" "+p1.age+" "+Person.count);
		p1.walk();
		p1.walk(2);
		System.out.println(p2.name+" "+p2.age+" "+Person.count);
		p2.work();
		
		
		Person p3=new Developer();
		p3.work();
		Person p4=new Developer("Nusrat",45);
		p4.work();
		System.out.println(Person.count);
		
		
		Laptop l1=new Laptop();
		l1.setPrice(35_800);
		System.out.println(l1.getPrice());
		
	    
		Car c1 = new BMW();
		c1.start();
		
		Rectangle r1=new Rectangle();
		r1.draw();
		r1.display();
		
	}
}

class Person
{
	String name;
	int age;
	private String nid;
	static int count;
	public Person()
	{
		count++;
		System.out.println("Creating Person constructor...");
	}
	public Person(String name,int age)
	{
		this();
		this.name=name;
		this.age=age;
	}
	void walk()
	{
		System.out.println(name+" is walking...");
	}
	void walk(int steps)
	{
		System.out.println(name+" is walking :"+steps);
	}
	 void eat()
	{
		System.out.println(name+" is eating...");
	}
	void work()
	{
		System.out.println(name+" is working...");
	}
}
class Developer extends Person
{
	public Developer(String name,int age)
	{
		super(name,age);
		System.out.println("Creating Developer constructor");
	}
	public Developer()
	{
		super();
	}
	void work()
	{
		System.out.println(name+" is developing...");
	}
}


//Encapsulation
class Laptop
{
	int ram;
	private int price;
	
	public int getRam() {  //getter method
		return ram;
	}
	public void setRam(int ram) {   //setter method

		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price)
	{
		boolean isAdmin=false;
		if(!isAdmin)
		{
			System.out.println("You cannot able to set price");
		}
		else {
		this.price=price;
		}
	}
	
}


//Abstraction
abstract class Car
{
	int price;
	abstract void start();
	void break1()
	{
		System.out.println("Break...");
	}
}
class BMW extends Car
{

	@Override
	void start() {
		
		System.out.println("BMW is starting...");
	}
	
	
}
class Audi extends Car
{

	@Override
	void start() {
		
		System.out.println("Audi is starting...");
	}
	
}


//Interface

interface showable
{
	void display();
}
interface drawable
{
	void draw();
}
class Rectangle implements showable, drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw...");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display...");
	}
	
}