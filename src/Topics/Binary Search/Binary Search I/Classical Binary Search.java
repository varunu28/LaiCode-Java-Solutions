public class Solution {
  public int binarySearch(int[] array, int target) {
    // Write your solution here
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (array[mid] == target) {
        return mid;
      }
      else if (array[mid] > target) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }

    return -1;
  }
}

