package com.modules.lambda;

public class LambdaGreetingService {
	public static void main(String args[]) {
		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
	}
}

interface GreetingService {
	void sayMessage(String message);
}
