/*Nested classes:- A class inside a class is called nested class.
 *
 *Syntax:-
 *class Outer
 *{
 *	class Inner
 *	{
 *	}
 *};
 *
 *There are two types of class in java as below and inner/nested class concept came in java 1.1 version:-
 *  1)static nested classes
 *  2) non-static nested classes (inner classes) 
 *  	i)Normal/Member inner class
 *  	ii)local inner class (inside method)
 *  	iii)Anonymous inner class
 *
 *eg:-
 *class Outer
 *{	int a=10,b=20;
 *	void m1(){}
 *	class Inner
 *	{	int x=100,y=200;
 *		void m2(){}
 *	};
 *1. How compiler generate the .class file:-
 *	 For Outer class: Outer.class
 *	 For Inner class: Outer$Inner.class ($ represent the inner class it help to generate .class file)
 *2. How to create objects:-
 *	 For Outer class: Outer o = new Outer();
 *	 For Inner class: Outer.Inner i = o.new Inner();
 *3. How to access the data:-
 *	 For Outer class: o.a o.b o.m1()
 *	 For Inner class: i.x i.y i.m2()
 *4. Inner class methods can access Outer class methods
 *	 but Outer class methods cannot access the Inner class data
 **/

package com.java.type_of_classes;

public class NestedOrInnerClassesInJava_1 {};	// This class not for use, only for file naming purpose.

//Normal/Member inner class
class Outer{
	int a=10,b=20;
	void m1(){
		System.out.println("I'm in outer class method1");
	}
	class Inner
	{
		int x=100,y=200;
		void m2(){
			System.out.println("I'm in inner class method2");
		}
	}
	public static void main(String[] args) {
		//Creating objects of outer and inner class
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		//Calling data, methods of outer and inner class
		System.out.println(o.a);
		System.out.println(o.b);
		o.m1();
		System.out.println(i.x);
		System.out.println(i.y);
		i.m2();
	}
};