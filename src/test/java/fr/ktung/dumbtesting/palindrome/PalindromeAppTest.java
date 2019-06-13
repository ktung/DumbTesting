package fr.ktung.dumbtesting.palindrome;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeAppTest {

  @Test
  public void isPalindromeNullOrEmpty() {
    assertTrue(PalindromeApp.isPalindrome(null));
    assertTrue(PalindromeApp.isPalindrome(""));
  }

  @Test
  public void isPalindrome() {
    assertTrue(PalindromeApp.isPalindrome("anna"));
    assertTrue(PalindromeApp.isPalindrome("ana"));
    assertTrue(PalindromeApp.isPalindrome("Ana"));
    assertTrue(PalindromeApp.isPalindrome("Anna anna"));
  }

  @Test
  public void isNotPalindrome() {
    assertFalse(PalindromeApp.isPalindrome("ane"));
    assertFalse(PalindromeApp.isPalindrome("Anna ana"));
  }
}
