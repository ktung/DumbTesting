package fr.ktung.dumbtesting.arrays.validmountain;

public class BasicValidMountain implements ValidMountain {
  @Override
  public boolean validMountainArray(int[] arr) {
    int count = 0;
    for (; count < arr.length-1 && arr[count] < arr[count+1]; count++) {
    }

    if (count == 0 || count == arr.length-1) {
      return false;
    }

    for (; count < arr.length-1 && arr[count] > arr[count+1]; count++) {
    }

    return count == arr.length-1;
  }
}
