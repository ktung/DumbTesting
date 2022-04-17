package fr.ktung.dumbtesting.arrays.replaceelement;

public class BasicReplaceElement implements ReplaceElement {
  @Override
  public int[] replaceElements(int[] arr) {
    int indexGreatest = -1;
    int valueGreatest = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (indexGreatest > i) {
        arr[i] = valueGreatest;
        continue;
      }

      if (indexGreatest == i) {
        indexGreatest = -1;
        valueGreatest = 0;
      }
      for (int j = arr.length-1; j > i; j--) {
        if (arr[j] > valueGreatest) {
          valueGreatest = arr[j];
          indexGreatest = j;
        }
      }

      arr[i] = valueGreatest;
    }

    arr[arr.length-1] = -1;
    return arr;
  }
}
