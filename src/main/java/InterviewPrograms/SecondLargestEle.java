package InterviewPrograms;

import java.util.Arrays;

public class SecondLargestEle {
    int arr[] = {10, 14, 22, 15, 13, 16, 17, 11};
    int temp;

    public static void main(String[] args) {
        SecondLargestEle obj = new SecondLargestEle();
        obj.byUsingBubbleSort();
      //  obj.byUsingArrayMethod();
    }

    public void byUsingArrayMethod() {
        Arrays.sort(arr);
        System.out.println("Second largest array: " + arr[arr.length - 2]);
    }

    public void byUsingBubbleSort() {
        System.out.println("Array size: " + arr.length);  // array counting started from 0
        // By using bubble sort method
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest array: " + arr[arr.length - 2]);
    }
}
