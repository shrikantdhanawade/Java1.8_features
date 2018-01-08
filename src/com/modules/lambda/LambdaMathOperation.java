package com.modules.lambda;

public class LambdaMathOperation {
	public static void main(String args[]) {
		LambdaMathOperation tester = new LambdaMathOperation();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		// One way to use method to pass the operation
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// use operation directly
		System.out.println("10 + 5 = " + addition.operation(10, 5));
		System.out.println("10 - 5 = " + subtraction.operation(10, 5));
		System.out.println("10 x 5 = " + multiplication.operation(10, 5));
		System.out.println("10 / 5 = " + division.operation(10, 5));

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}