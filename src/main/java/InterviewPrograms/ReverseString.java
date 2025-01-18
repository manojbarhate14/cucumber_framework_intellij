package InterviewPrograms;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.wordwiseReverseString();
        obj.reverseAllString();
    }

    public void wordwiseReverseString() {
        String str = "Selenium and Java";
        String a[] = str.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void reverseAllString() {
        String str = "Selenium and Java";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.print(reverse);
    }
}
