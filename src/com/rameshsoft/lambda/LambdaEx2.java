package com.rameshsoft.lambda;

interface Operations
{
	void add(int num1, int num2);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		Operations op1 = (int num1, int num2) -> System.out.println("Addition of two numbers: "+(num1+num2));
		op1.add(10, 20);
		//When we take the lamda arguments the type of the argument is optional.
		Operations op2 = (num1, num2) -> {System.out.println("Subtraction of two numbers: "+(num1-num2));
												  System.out.println("Multiplication of two numbers: "+(num1*num2));};
		op2.add(6, 3);
	}
}
