package fr.ktung.dumbtesting.sorting.sortcolors;

public class BasicSortColors implements SortColors {
    @Override
    public void sortColors(int[] nums) {
        int nbZero = 0;
        int nbOne = 0;
        int nbTwo = 0;

        for (int num : nums) {
            if (num == 0) {
                ++nbZero;
            } else if (num == 1) {
                ++nbOne;
            } else if (num == 2) {
                ++nbTwo;
            }
        }

        for (int i = 0; i < nbZero; i++) {
            nums[i] = 0;
        }
        for (int i = nbZero; i < (nbZero+nbOne); i++) {
            nums[i] = 1;
        }
        for (int i = (nbZero+nbOne); i < (nbZero+nbOne+nbTwo); i++) {
            nums[i] = 2;
        }
    }
}
