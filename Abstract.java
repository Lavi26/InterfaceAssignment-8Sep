package com.classassignments;

//Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for
//class B and display the text “call me from B”.

abstract class A {
	abstract void display();
	
	void show() {
		
	}
	
} 

class B extends A {
	void display() {
		
		System.out.println("call me from B");
	}
	
}

public class Abstract {
	
	public static void main(String args[]) {
		
		A obj = new B();
			obj.display();
		
		
	}

}
