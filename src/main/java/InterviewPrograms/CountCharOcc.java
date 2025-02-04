package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOcc {

    public static void main(String[] args) {
           // eachCharCount();
            specificLetterCount();
    }
    public static void specificLetterCount(){
        String str = "java is a object oriented language";

        //Subtracts the length of the string without "a" from the length of the original string.

        int strLength = str.length();
        int without_a_length = str.replaceAll("a","").length();

        System.out.println("Total length of str = "+strLength);
        System.out.println("length of str without 'a' = "+without_a_length);

        int a_count = strLength - without_a_length;
        System.out.println("a count in str = "+a_count);
    }

    public static void eachCharCount(){
        String mainString  = "aabbccrrttta";
        char[] arr = mainString.toCharArray();

        Map<Character, Integer> mp = new LinkedHashMap<>();

        for (char loopOne : arr) {
            int count = 0;
            for (char loopTwo : arr) {
                if (loopOne == loopTwo) {
                    count++;
                }
            }
            mp.put(loopOne, count);
        }
     //   System.out.println(mp);
        for(Map.Entry<Character, Integer> e: mp.entrySet())
        {
            System.out.println(e.getKey()+" = "+ e.getValue());
        }
    }
}
