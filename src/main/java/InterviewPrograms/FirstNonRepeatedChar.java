package InterviewPrograms;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String word = "swisshttodft";
        boolean flag = true;

        //Note:check the last index number of same character if both index number same then it is first non-repeated char
        // here 'w' char index is 1 and this is the last index as well so codn true 1==1

        for (char i : word.toCharArray()) {
            if (word.indexOf(i) == word.lastIndexOf(i)) {
                System.out.println("The first character which is not repeating is: " + i);
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("There is no non-repeating character in the input string");
        }
    }
}

