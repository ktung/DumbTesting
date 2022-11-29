package fr.ktung.dumbtesting.sorting.sortcolors;

public interface SortColors {

//    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
//        of the same color are adjacent, with the colors in the order red, white, and blue.
//    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//    You must solve this problem without using the library's sort function.
//    Constraints:
//    n == nums.length
//    1 <= n <= 300
//    nums[i] is either 0, 1, or 2.
//    Follow up: Could you come up with a one-pass algorithm using only constant extra space?
    void sortColors(int[] nums);
}
