package com.rameshsoft.lambda;

@FunctionalInterface
interface Service
{
	String login(String username, String password);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		Service s1 = (username, password) -> {return username.equalsIgnoreCase("ramesh") && password.equals("Ramesh@956")? "Login Sucess":"Login fail";};
		String status1 = s1.login("Ramesh", "Ramesh@956");
		System.out.println("Your login status..."+status1);
		//while writing the lambda expression logics giving the statements optional
		Service s2 =(username, password) -> username.equalsIgnoreCase("Ramesh") && password.equals("Anu@123")? "Login Sucess": "Login Failed";
		String status2 = s2.login("ramesh", "123");
		System.out.println("Your login status..."+status2);
	}
}
