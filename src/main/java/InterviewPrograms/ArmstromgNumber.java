package InterviewPrograms;

public class ArmstromgNumber {

    public static void main(String[] args) {
        int num = 153;  // 1^3 + 5^3 + 3^3= 1+125+27= 153
        int arm = 0, r, temp;
        temp = num;

        while (num > 0) {
            r = num % 10;
            arm = arm + r * r * r;
            num = num / 10;
        }
        if (temp == arm) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
