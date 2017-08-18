package com.jp.learn_agile.palindrome;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class PalindromeParameterizedTest {

	@Parameters(name="{0} is palindrome test? = {1}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{"madam",true},{"not a palindrome",false}});
	};
	
	@Parameter(0)
	public String input;
	
	@Parameter(1)
	public boolean expected;
	
	@Test
	public void isPalindrome_passedValidPalindromeNumber_returnsTrue() {
		assertThat(Palindrome.isPalindrome(input),is(expected));
	}
	

}
