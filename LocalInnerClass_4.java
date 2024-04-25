/*Local inner class:- Creating a class inside the class method is called local inner class
 *we can create multiple class inside the method also and we can access inheritance inside
 *the method eg:-
 *class Outer
 *{
 *	void m1()
 *	{
 *		class Inner1	// scope of the inner class is within the method
 *		{
 *		}
 *		class Inner2 extends Inner1
 *		{
 *		}
 *	}
 *	void m2()
 *	{
 *		class Inner3
 *		{
 *		}
 *	}
 *};
 *
 *How many modifier is applicable:-
 *In outer class: 1)public 2)default 3)final 4)abstract 5)strictfp
 *In inner class: 1)public 2)default 3)final 4)abstract 5)strictfp 6)static 7)private 8)protected
 *
 *We create object of inner class within the method because it's scope is within the method only.
 *Inside the for-loop we can use the local inner classes*/
package com.java.type_of_classes;

public class LocalInnerClass_4 {} // No use of this class only for class file naming purpose

//Local inner class
class Outer4 {
	void m1() {
		class Inner4 {	// If inner class is abstract we can not create the object of this class.
			void disp() {
				System.out.println("Method local inner class");
			}
		}
		// Creating object of inner class within the method
		Inner4 i = new Inner4();
		i.disp();
	}
	public static void main(String[] args) {
		// Creating object of outer class
		Outer4 o = new Outer4();
		o.m1();
	}
};

//Local inner class inheritance
class Outer5 {
	void m1() {
		class Inner5 {
			void disp1() {
				System.out.println("Good Morning");
			}
		}
		class Inner6 extends Inner5 {
			void disp2() {
				System.out.println("Good Evening");
			}
		}
		// Creating object of inner class within the method
		Inner6 i = new Inner6();
		i.disp1();
		i.disp2();
	}
	public static void main(String[] args) {
		new Outer5().m1();
	}
};

//Local inner class inside for-loop
class Outer6 {
	void m1() {
		for(int i=1; i<=10; i++) {
			class Inner7 {
				void disp() {
					System.out.println("Good Morning");
				}
			}
			new Inner7().disp();
		}
	}
	public static void main(String[] args) {
		new Outer6().m1();
	}
};