/*Lambda Expression:- It is similar as anonymous inner class but it is only used for 
 *functional interface(An Interface that contains exactly one abstract method ) or 
 *A lambda expression is a short block of code that takes in parameters and returns 
 *a value. Lambda expressions are similar to methods but don't need a name. 
 *They are a feature of Java SE 8 and are used to represent a method interface 
 *using an expression
 *
 *
 *Syntax:- (args)->expression
 *
 *
 *Advantages/Uses:-
 *1. Reduce the length of the code.
 *2. Reduce the byte code.
 *3. Used in functional interface.*/
package com.java.type_of_classes;

//Use of lambda expression using functional interface
interface I1 { // functional interface
	void display();

	static void show() {
		System.out.println("I'm in I1 interface show method");
	}
}
public class LambdaExpression_7 {
	public static void main(String[] args) {

		I1 i1 = () -> System.out.println("Using lambda expression");
		i1.display();
		I1.show();
		I1 i2 = () -> {	// we can use multiple logics with functional interface.
			System.out.println("This is lambda 1");
			System.out.println("This is lambd 2");
		};
		i2.display();
	}
};

//lambda expression using functional interface with arguments
interface I2 { // functional interface
	void display(int x, int y);
}
class LambdaExpression2 {
	public static void main(String[] args) {

		I2 i2 = (int x, int y) -> {
			System.out.println("Sum is: " + (x + y));
			System.out.println("Mul is: "+ x * y);
		};
		i2.display(2,5);
		
		// Taking args without data types it is optional
		I2 i3 = (a,b) -> System.out.println("Division is: " + a / b);
		i3.display(5,2);
	}
};

// lambda expression using functional interface with arguments and return type
interface I3 { // functional interface
	String display(int a);
}
class LambdaExpression3 {
	public static void main(String[] args) {

		I3 i3 = (a) -> {System.out.println("Hello"); return "Darshan";};
		String s = i3.display(0);
		System.out.println(s);
		
		// If there is single S.o.p statement {} curly braces is optional and while specifying the args type of the args is optional and if you have only the return statement written statement it's self is optional.
		I3 i4 = (a) -> "Rahul";
		String s1 = i4.display(5);
		System.out.println(s1);
	}
};

// Functional interface program 1
interface I4 {
	String login(String uname, String upwd);
}
class LambdaExpression4 {
	public static void main(String[] args) {

		I4 i4 = (uid,upwd) -> {
			if(uid.equals("Darshan") && upwd.equals("0000")) {
				return "Success";
			}
			else {
				return "Fail";
			}
			};
			String str = i4.login("Darshan", "0000");	//Pass the user name and password
			System.out.println(str);
	}
};

// Functional interface program 2
interface  Message {
	void disp();
}
class LambdaExpression5 {
	static void one(Message m) {
		m.disp();
	}
	public static void main(String[] args) {

		// Approach 1: normal approach (separate class to write the logic)- when you want MyClass or separate class logic multiple times then use this approach.
		LambdaExpression5.one(new MyClass());
		
		// Approach 2: anonymous approach (no need to take separate class)- when there is no use of separate class means when one time logic is required and it also can be used as when interface has more then 1 abstract method then use this approach and one time logic is required.
		LambdaExpression5.one(new Message()
				{
					public void disp() {
						System.out.println("Good Morning");
					}
				});
		
		// Approach 3: lambda expression (lambda)- used for functional interface if there is only one abstract method and one time logic is used.
		LambdaExpression5.one(()->System.out.println("Good Morning"));
		
	}
}
class MyClass implements Message {
	public void disp() {
		System.out.println("Good Morning");
	}
};
