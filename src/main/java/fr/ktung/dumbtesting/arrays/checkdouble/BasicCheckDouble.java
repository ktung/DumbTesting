package fr.ktung.dumbtesting.arrays.checkdouble;

public class BasicCheckDouble implements CheckDouble {
  @Override
  public boolean checkIfExist(int[] arr) {
    int[] doubleVal = new int[arr.length];
    int doubleIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < doubleIndex; j++) {
        if ( (doubleVal[j] == arr[i] || doubleVal[j] == arr[i]*4)) {
          return true;
        }
      }

      doubleVal[doubleIndex++] = arr[i]*2;
    }
    return false;
  }
}
