package InterviewPrograms;

public class FindTargetIndexArray {
    public static void main(String[] args) {

        searchTargetIndex();
    }

    public static void searchTargetIndex() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target number Index is : " + i);
            }
        }
    }

    public static void findTargetInSortedArrayByBinarySearch() {
        //Binary search is an efficient algorithm that finds a target value in a sorted array by repeatedly
        // dividing the search interval in half.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Index: " + mid);
                return; // Exit the program after finding the target
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target not found in the array.");
    }
}