package javaReview1;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println("5 + 3 = " + calc(5, 3, '+'));
		System.out.println("5 - 3 = " + calc(5, 3, '-'));
		System.out.println("5 * 3 = " + calc(5, 3, '*'));
		System.out.println("5 / 3 = " + calc(5, 3, '/'));
		System.out.println("5 ? 3 = " + calc(5, 3, '?'));
	}
	
	static int calc(int num1, int num2, char symbol) {
		if( symbol == '+' ) {
			return num1 + num2;
		} else if( symbol == '-' ) {
			return num1 - num2;
		} else if( symbol == '*' ) {
			return num1 * num2;
		} else if( symbol == '/' ) {
			return num1 / num2;
		} else {
			throw new ArithmeticException("演算子が不正です。");
		}
	}
}
