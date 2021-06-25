package edu.cnm.deepdive;

/*

Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the
corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */
public class CodingBatTheMatchUp {

  private static int[] one = {1, 2, 3},  four = {2, 3, 10};
  private static int[] two= {1, 2, 3}, five = {2, 3, 5};
  private static int[] three = {1, 2, 3}, six = {2, 3, 3};

  public static void main(String[] args) {
    System.out.println("given the two arrays [1, 2, 3] and [2, 3, 10],the outcome will be " + matchUp(one, four) + ".");
    System.out.println("given the two arrays [1, 2, 3] and [2, 3, 5],the outcome will be " + matchUp(two, five) + ".");
    System.out.println("given the two arrays [1, 2, 3] and [2, 3, 3],the outcome will be " + matchUp(three, six) + ".");

  }

  public static int matchUp(int[] nums1, int[] nums2) {
    int count = 0;

    for (int i = 0; i < nums1.length; i++) {
      if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) > 0) {
        count++;
      }
    }
    return count;
  }

}
