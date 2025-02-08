import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static String ArrayMatching(String[] strArr) {
        // code goes here
        String arr1Str = strArr[0].replaceAll("[\\[\\]]","");
        String arr2Str = strArr[1].replaceAll("[\\[\\]]","");

        int[] arr1 = Arrays.stream(arr1Str.split(","))
                .map(String::trim) // Trim whitespace!
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays.stream(arr2Str.split(","))
                .map(String::trim) // Trim whitespace!
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(arr1.length, arr2.length);

        List<Integer> resrultList = new ArrayList<>();

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length && i < arr2.length) {
                resrultList.add(arr1[i] + arr2[i]);
            } else if (i < arr1.length) {
                resrultList.add(arr1[i]);
            } else {
                resrultList.add(arr2[i]);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resrultList.size(); i++) {
            result.append(resrultList.get(i));
            if (i < resrultList.size() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String[] input = {"[5, 2, 3]", "[2, 2, 3, 10, 6]"}; // Example with no extra spaces
        String output = ArrayMatching(input);
        System.out.println(output);

        String[] input2 = {"[5,  2, 3]", "[2 ,2,3, 10,  6]"}; // Example with extra spaces
        String output2 = ArrayMatching(input2);
        System.out.println(output2);

    }
}