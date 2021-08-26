package javaReview1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex09 {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = Integer.parseInt(args[2]);
		int hour = Integer.parseInt(args[3]);
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);
		
		LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");
		
		System.out.println( localDateTime.format(formatter) + "の1年2ヶ月3日4時間5分6秒後は");
		
		localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plusMonths(2);
		localDateTime = localDateTime.plusDays(3);
		localDateTime = localDateTime.plusHours(4);
		localDateTime = localDateTime.plusMinutes(5);
		localDateTime = localDateTime.plusSeconds(6);
		
		System.out.println( localDateTime.format(formatter) + "です");
	}

}
