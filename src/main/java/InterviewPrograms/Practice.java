package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> List1 = List.of(1,2,3,4,1,5,2);
        List<Integer> List2 = List.of(6,7,8,6,7,9);

        List<Integer> merge = new ArrayList<>(List1);
        merge.addAll(List2);
        Collections.sort(merge);
        System.out.println(merge);
    }
}
