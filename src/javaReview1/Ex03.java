package javaReview1;

public class Ex03 {
	public static void main(String[] args) {
		
		for( int i = 1; i <= 100; i++ ) {
			System.out.println(fizzBuzz(i));
		}
	}
	
	static String fizzBuzz(int num) {
		if( num % 5 == 0 && num  % 3 == 0 ) {
			return "FizzBuzz";
		} else if( num % 5 == 0 ) {
			return "Buzz";
		} else if( num % 3 == 0 ) {
			return "Fizz";
		} else {
			return String.valueOf(num);
		}
	}
}
