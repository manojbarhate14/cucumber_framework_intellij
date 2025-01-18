package InterviewPrograms;

public class Practice {
    public static void main(String[] args) {

        String word = "swisshttodft";

        for (char i : word.toCharArray()) {
            System.out.println(word.indexOf(i)+" ,"+word.lastIndexOf(i));
        }
    }
}
