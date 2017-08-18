package com.jp.learn_agile.palindrome;
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

		@Test
	    public void testPalindromeTrue()
	    {
	        assertTrue( true == Palindrome.isPalindrome("5885") );
	    }
		
		@Test
	    public void testPalindromeFalse()
	    {
	        assertTrue( false == Palindrome.isPalindrome("5885a") );
	    }
		
		@Test(expected = NullPointerException.class)
	    public void testPalindromeException()
	    {
	        Palindrome.isPalindrome(null);
	    }
		


}
