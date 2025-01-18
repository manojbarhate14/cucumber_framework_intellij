package InterviewPrograms;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        String str1 = "Army";
        String str2 = "mary";

        char[] str3 = str1.toLowerCase().toCharArray();
        char[] str4 = str2.toLowerCase().toCharArray();
        Arrays.sort(str3);
        Arrays.sort(str4);
        if (Arrays.equals(str3, str4)) {
            System.out.println("Given String is Anagram");
        } else {
            System.out.println("Given String is not Anagram String");
        }
    }
}
