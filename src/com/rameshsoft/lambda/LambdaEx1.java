package com.rameshsoft.lambda;

@FunctionalInterface
interface Greeting
{
	void greet();
}
public class LambdaEx1 {

	public static void main(String[] args) {
		Greeting g1 = () -> System.out.println("Ramesh is a Software Engineer");
		g1.greet();
		
		System.out.println("*******");
		//When we take the multiple statements take that statements inside the braces.
		Greeting g2 = () -> {System.out.println("PC sleeping...");
							 System.out.println("PC restart...");};
		g2.greet();
		}
		
}


