package InterviewPrograms;

import java.util.Scanner;

class Main {

    public static int ChangingSequence(int[] arr) {
        // code goes here
        int n = arr.length;
        if (n < 3) {
            return -1;
        }

        boolean increasing = arr[1] > arr[0];
        int varOcg = -1;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                if (!increasing) {
                    varOcg = i;
                    break;
                }
                increasing = true;
            } else if (arr[i + 1] < arr[i]) {
                if (increasing) {
                    varOcg = i;
                    break;
                }
                increasing = false;
            } else {

                int j = i + 1;
                while (j < n && arr[j] == arr[i]) {
                    j++;
                }
                if (j < n) {
                    if (arr[j] > arr[i]) {
                        if (!increasing) {
                            varOcg = i;
                            break;
                        }
                        increasing = true;
                    } else {
                        if (increasing) {
                            varOcg = i;
                            break;
                        }
                        increasing = false;
                    }
                    i = j -1;
                } else {

                    return -1;
                }
            }
        }
        return varOcg;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] strArr = input.replaceAll("[{}\\[\\]]", "").split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i].trim());
        }
        System.out.print(ChangingSequence(arr));
    }
}