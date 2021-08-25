package javaReview1;

public class Ex07 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if( n < 1 || n > 20 ) {
			System.out.println("1〜20までの数字を入力してください");
		} else {
			for(int i = 1; i <= n; i++ ) {
				for( int j = 1; j <= n; j++ ) {
					int answer = i * j;
					if( answer < 10 ) {
						System.out.print("  ");
					} else if( answer < 100 ) {
						System.out.print(" ");
					}
					System.out.print( answer + " ");
				}
				System.out.println();
			}
		}
	}

}
