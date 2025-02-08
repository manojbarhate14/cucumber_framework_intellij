package InterviewPrograms;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true; // An empty string or null is considered a palindrome
        }
        // 1. Preprocessing: Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // 2. Two-pointer approach for palindrome check
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = ""; //empty string
        String test3 = null; //null string

        System.out.println("\"" + test1 + "\" is a palindrome: " + isPalindrome(test1)); // true
        System.out.println("\"" + test2 + "\" is a palindrome: " + isPalindrome(test2)); // true
        System.out.println("\"" + test3 + "\" is a palindrome: " + isPalindrome(test3)); // false
    }
}
