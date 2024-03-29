package fr.ktung.dumbtesting.arrays.duplicatezeros;

public class BasicDuplicateZeros implements DuplicateZeros {
  @Override
  public void duplicateZeros(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        for (int j = arr.length-1; j > i; j--) {
          arr[j] = arr[j-1];
        }
        arr[i++] = 0;
      }
    }
  }
}
