package fr.ktung.dumbtesting.palindrome;

import org.apache.commons.lang3.StringUtils;

public class PalindromeApp {

  public static boolean isPalindrome(String word) {
    if (StringUtils.isEmpty(word)) {
      return true;
    }

    if (1 == word.length()) {
      return false;
    }

    String unsensitiveCaseWord = word.toLowerCase();
    int i = 0;
    int j = word.length()-1;
    while (i < j) {
      if (unsensitiveCaseWord.charAt(i) != unsensitiveCaseWord.charAt(j)) {
        return false;
      }

      ++i;
      --j;
    }

    return true;
  }
}
