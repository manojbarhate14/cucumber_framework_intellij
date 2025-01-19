package InterviewPrograms;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        // obj.wordwiseReverseString();
        // obj.reverseAllString();
        reverseEachWordOnSamePlace();
    }

    public void wordwiseReverseString() {
        String str = "Selenium and Java";
        String a[] = str.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void reverseEachWordOnSamePlace()
    {
        String str = "Selenium and Java";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        String reversedString = String.join(" ", words);

        System.out.println("Reversed string: " + reversedString);
    }

    public void reverseAllString() {
        String str = "Selenium and Java";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse =reverse+str.charAt(i);
        }
        System.out.print(reverse);
    }
}
