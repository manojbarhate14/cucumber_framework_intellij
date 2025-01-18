package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CountCharOcc {

    public static void main(String[] args) {
            //eachLetterCount();
            specificLetterCount();
    }
    public static void specificLetterCount(){
        String str = "java is a object oriented language";

        //Subtracts the length of the string without "a" from the length of the original string.

        int letter = str.length() - str.replaceAll("a","").length();
        System.out.println(letter);
    }

    public static void eachLetterCount(){
        String str = "aabbccrrttt";
        char[] arr = str.toCharArray();

        Map<Character, Integer> mp = new LinkedHashMap<>();

        for (char str1 : arr) {
            int count = 0;
            for (char compareWord : arr) {
                if (str1 == compareWord) {
                    count++;
                }
            }
            mp.put(str1, count);
        }
     //   System.out.println(mp);
        for(Map.Entry<Character, Integer> e: mp.entrySet())
        {
            System.out.println(e.getKey()+" = "+ e.getValue());
        }
    }
}
