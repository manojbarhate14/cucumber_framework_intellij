package InterviewPrograms;

public class LongestAndSmallestString {

    public static void main(String[] args) {
        String str = "I love playing cricket with my college friend";

        String word[] = str.split("\\s+");

        String largest = word[0];
        String smallest = word[0];

        for (String str1 : word) {
            if (str1.length() < smallest.length()) {
                smallest = str1;
            }
            if (str1.length() > largest.length()) {
                largest = str1;
            }
        }
        System.out.println("smallest string: " + smallest);
        System.out.println("Largest string: " + largest);
    }
}
