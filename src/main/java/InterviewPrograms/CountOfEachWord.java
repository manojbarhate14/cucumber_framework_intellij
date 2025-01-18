package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountOfEachWord {
    public static void main(String[] args) {
        removeDuplicateWord();
    }
    public static void removeDuplicateWord()
    {
        String str = "i am i am manoj manoj i";
        String word [] = str.split(" ");
        Set<String> set= new LinkedHashSet<>();
        for (String sep : word)
        {
            set.add(sep);
        }
        for(String name : set)
        {
            System.out.print (name+" ");
        }
    }

    public static void eachWordCount() {
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
