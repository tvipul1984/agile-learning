package com.jp.learn_agile.leapyear;

import static org.junit.Assert.*;

import org.junit.Test;

public class LearYearTest {
	@Test
	public void isLeapYear_divisibleBy4ButNotBy100_true() throws Exception {
		assertTrue(LeapYearUtil.isLeapYear(2004));
	}

	@Test
	public void isLeapYear_divisibleBy4ButNotBy100ther_true() throws Exception {
		assertTrue(LeapYearUtil.isLeapYear(1996));
	}

	@Test
	public void isLeapYear_divisibleBy400Other_true() throws Exception {
		assertTrue(LeapYearUtil.isLeapYear(2000));
	}

	@Test
	public void isLeapYear_Not_a_Leap_Year_false() throws Exception {
		assertFalse(LeapYearUtil.isLeapYear(1900));
	}

	
}
