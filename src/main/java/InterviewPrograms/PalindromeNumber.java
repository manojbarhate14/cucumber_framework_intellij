package InterviewPrograms;

public class PalindromeNumber {

    public static void main(String[] args) {
        int reverse = 0, num = 151, reminder = 0, temp = num;;

        while (temp > 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;
        }

        if (num == reverse) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}
