package fr.ktung.dumbtesting.arrays.numberevendigits;

public class BasicNumbersEvenDigits implements NumbersEvenDigits {
  @Override
  public int numberEvenDigits(int[] nums) {
    int countEven = 0;
    for (int num : nums) {
      String numString = String.valueOf(num);
      if (numString.length() % 2 == 0) {
        countEven++;
      }
    }

    return countEven;
  }
}
