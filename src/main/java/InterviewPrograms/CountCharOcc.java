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
        String mainString  = "aabbccrrttt";
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
