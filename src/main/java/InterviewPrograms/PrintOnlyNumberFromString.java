package InterviewPrograms;

public class PrintOnlyNumberFromString {

    public static void simpleApproch() {
        String str = "bnm235nbj244";
        String s = str.replaceAll("[^0-9]", "");
        System.out.println(s);
    }

    public static void returnZeroIfFirstChar() {
        String str = "word of 991";
        String number = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number += c;
            } else {
                break;
            }
        }
        if(!number.isEmpty())
        {
            int num = Integer.parseInt(number);
            System.out.println(num);
        }else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        simpleApproch();
        returnZeroIfFirstChar();
    }
}
