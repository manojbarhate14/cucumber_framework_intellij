package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachWord {
    public static void main(String[] args) {
        String str = "i am i am manoj manoj i";
        String[] words = str.split(" "); // Split the string into individual words
        Map<String, Integer> mp = new LinkedHashMap<>();

        for (String str1 : words) {
            int count = 0;
            for (String compareWord : words) {
                if (str1.equals(compareWord)) {
                    count++;
                }
            }
            mp.put(str1, count);
        }
        System.out.println(mp);
    }
}
