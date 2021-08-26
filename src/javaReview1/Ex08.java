package javaReview1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex08 {

	public static void main(String[] args) {
		
		LocalDate olympic = LocalDate.of(2020, 7, 24);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日E曜日");
		System.out.println("東京オリンピックの開会式は" + olympic.format(formatter) + "に開催されました。");
		
		LocalDate myBirthDay = LocalDate.of(1997, 9, 29);
		System.out.println("私の誕生日は" + myBirthDay.format(formatter) + "です。");
	}

}
