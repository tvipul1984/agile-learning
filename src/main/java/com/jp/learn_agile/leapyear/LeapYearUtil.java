package com.jp.learn_agile.leapyear;

public class LeapYearUtil {

	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

}
