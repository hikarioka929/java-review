package javaReview1;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 1;
		int k;
		
		System.out.print(i + " ");
		System.out.print(j + " ");
		
		while(true) {
			k = i + j;
			
			if(k > 1000) {
				break;
			}
			
			System.out.print(k + " ");
			
			i = j;
			j = k;
			
		}
	}

}
