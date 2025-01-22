package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElementOccInArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 7, 4, 5, 3, 2, 1, 4, 5, 6, 2, 2, 1, 4};

        Map<Integer, Integer> mp = new LinkedHashMap<>();

        for (int num : arr) {
            int count = 0;
            for (int num2 : arr) {
                if (num == num2) {
                    count++;
                }
            }
            mp.put(num, count);
        }
        System.out.println(mp);
    }
}
