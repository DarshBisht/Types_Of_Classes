/*normal inner class:- It is also known as regular or member class also which is inside
 *the outer class.
 *
 *Syntax:-
 *class Outer
 *{
 *	class Inner
 *	{
 *	}
 *};
 *
 *case 1: In normal inner class static declaration is not allowed like static variable,
 *		  main method, static block not possible.
 *case 2: static is only allowed in constant variable declaration.
 *
 *Inner class can access the outer class data but outer class not so
 *and it can access private member also.*/

package com.java.type_of_classes;

public class NoramalInnerClass_3 {};	// No use of the class only for class file naming purpose

//Normal class (We can access main method in different or in separate class also)
class Outer1 {
	private int a=10,b=20;
	void m1() {
		System.out.println("I'm in outer class method1");
	}
	class Inner1 {	//case 1: In normal inner class static declaration is not allowed like static variable, main method, static block not possible.
		final static int x=100,y=200;	//case 2: static is only allowed in constant variable declaration. 
		final void m2() {	// Inner class can access the outer class data and it can access private member also.
			System.out.println("I'm in inner class method2");
			System.out.println(x+y);
			System.out.println(a+b);
			m1();
		}
	}
};
class test {	// In this program three .classes file will be generated	1)Outer.class 2)Outer$Inner.class 3)Test.class
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.m1();
		Outer1.Inner1 i = o.new Inner1();
		i.m2();
	}
};

// We can access main method in outer class also
class Outer2 {
	int a=10,b=20;
	void m1() {
		System.out.println("I'm in outer class method1");
	}
	class Inner2 {
		int x=100,y=200;
		void add(int i, int j) {
			System.out.println(i+j);
			System.out.println(x+y);
			System.out.println(a+b);
			System.out.println(this.x+this.y);	// this refers to current class instances
			System.out.println(Outer2.this.a+Outer2.this.b);	//this refers to outer class instances
		}
	}
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.Inner2 i = o.new Inner2();
		i.add(5,10);
		System.out.println("---------------");
		//Create inner class object without using outer class reference in one line.
		Outer2.Inner2 i2 = new Outer2().new Inner2();
		i2.add(1000,2000);
		System.out.println("---------------");
		//Call inner class method in one line using object
		new Outer2().new Inner2().add(500, 500);
	}
};

//Using constructor
class Outer3 {
	int a=10;
	//Constructor (In default constructor super keyword is used to refer to the immediate parent class of the current class)
	Outer3() {
		System.out.println("Outer class constructor");	//It'll print 3rd
	}
	//Instance block (uses: Instance blocks can be used to initialize instance variables of a class. They can also be used to perform other tasks, such as logging or opening a database connection.)
	{
		System.out.println("Outer class instance block");	//It'll print 2nd (constructor call the instance block first: Instance block is just an alternative to initialize the instance variables. It gets invoked at the time of object creation. First class is loaded then constructor is invoked and the instance initializer block is copied to the constructor after its first statement (super(); // call to parent class constructor ).)
	}
	//static block
	static {
		System.out.println("Outer class static block");	// It'll print 1st
	}
	class Inner3 {
		//Constructor
		Inner3() {
			System.out.println("Inner class constructor");	//It'll print 5th
		}
		//Instance block
		{
			System.out.println("Inner class instance block");	//It'll print 4th
		}
	}
	public static void main(String[] args) {
		new Outer3().new Inner3();	//Creating outer inner class object
	}
}