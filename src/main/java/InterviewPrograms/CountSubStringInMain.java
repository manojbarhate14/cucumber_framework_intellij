package InterviewPrograms;

public class CountSubStringInMain {

    public static void main(String[] args) {
        String mainString = "application app my apps cat bat";
        String substring = "app";
        int count = 0;
        int index = 0;


        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        System.out.println("The substring: " + substring + " is occurs " + count + " times in the mainstring");

    }
}
