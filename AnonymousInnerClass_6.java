/*Anonymous inner class:- Nameless inner class in java is called Anonymous inner class
 * 
 *Advantages/Use of anonymous class:-
 *1. We use Anonymous inner class to achieve method overriding.
 *2. Length of the code reduced: because we are eliminating overriding class means
 *	 it removes the extends, implementation keyword (less coding).
 *3. We can use anonymous inner class inside the main method also.
 *4. Internally class generated: byte code increased.(in this 3 .class file is generated but where inheritance had only 2 classes)*/

package com.java.type_of_classes;

public class AnonymousInnerClass_6 {};	// No use of the class only for class file naming purpose

class A {
	void display()
	{
		System.out.println("I'm in class A disp method");
	}
}
//class B extends A {	// When we use Anonymous class we do not need to use this overriding class it is not for understanding purpose.
//	void disp() {
//		System.out.println("I'm in class B disp method");
//	}
//	public static void main(String[] args) {
//		B b = new B();
//		b.disp();
//	}
//};

// Using Anonymous inner class
class B {	// Creating another class to achieve overriding through anonymous class.
	A a = new A() {	//Anonymous inner class	(A a = new A : In this we are not creating object but internally some x class is generated and that x class extends the A class(parent class of anonymous class) and that x class object will be created : to know that x class name: S.o.p(a.getClass().getName()); anonymous inner .class fill will generate. that will be as "B$1")
		@Override	//Method overriding
		void display() {
			System.out.println("I'm in Anonymous inner class display method");
			System.out.println(a.getClass().getName());	// it gives the anonymous inner .class file names which is showing  "B$1" in the console. 
		}
	};	// semicolon is necessary when you use anonymous class.
	public static void main(String[] args) {
		B t = new B();
		t.a.display();
	}
};


// Using abstract method
abstract class A2 {
	abstract void display2();
	void show() {
		System.out.println("I'm in A2 show method");
	}
}

class B2 {
	public static void main(String[] args) {
//		A2 a = new A2() {
		new A2() {		// We can also use this without A2 reference inside the main method only
			@Override
			void display2() {
				System.out.println("I'm in B2 Anonymous inner class display2 method");
			}
			@Override
			void show() {
				display2();
				System.out.println("I'm in B2 Anonymous inner class show method");
			}
//		};
//		a.show();
		}.show();	// Calling show() method without reference but at a time only one method can be called by . operator note while using . operation do not use the semicolon otherwise compile time error will occur.
	}
};

//Using interface
interface A3 {
	void display3();
}
class B3 {	
	public static void main(String[] args) {
		A3 a = new A3() {
			@Override
			public void display3() {
				System.out.println("I'm in B3 Anonymous inner class display3 method");
			}
		};
		a.display3();
	}
};