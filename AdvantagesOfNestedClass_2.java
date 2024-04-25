/*Advantages of nested classes:-
 *1. If there is one time use of another class logic so except creating separate class
 *	 use inner class. and after that there is no use of another class eg:- a class
 * 	 required class b logic and after that there is no use of class b therefore we
 * 	 use inner class (class binded all the data and logic in single place).
 *	 a. all the logic in single place: encapsulation : grouping data.
 *	 b. readability increases.
 *	 c. inner class can access outer class private properties.
 *2. If there are multiple methods in class b and one method want to use class a 
 *	 there is one time use of class a data or members so creating class a 
 *	 separately we create class inside the method for that.
 *	 eg:- class test
 *		  { void m1(){}
 *			void m2(){class x{}}
 *			void m3(){}
 *		  }
 *3. One time usage : logic required only one time.
 *4. For the functionality we use inner class concept
 *	 eg:- class Bank
 *a)	  {	class Account	//Account class exist due to Bank class that is the functionality
 *			{
 *			}
 *		  };
 *b)	  class College
 *		  {	class Department
 *			{
 *			}
 *		  };
 *c)	  class Map	// collection concept entry exist due to Map
 *		  {	class Entry
 *			{
 *			}
 *		  };
 **/		

package com.java.type_of_classes;

public class AdvantagesOfNestedClass_2 {};	// No use of the class only for class file naming purpose
