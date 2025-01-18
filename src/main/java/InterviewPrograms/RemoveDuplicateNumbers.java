package InterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        RemoveDuplicateNumbers obj = new RemoveDuplicateNumbers();
        obj.removeDuplicate();
    }

    public void removeDuplicate() {
        int arr[] = {10, 25, 13, 45, 12, 46, 12, 45, 25, 12, 48, 12};
        System.out.println("Print only duplicate");
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int ar : arr) {
            //unique.add(ar);
            if (!unique.add(ar)) {
                duplicates.add(ar);
            }
        }
        System.out.println("Remove Duplicate: " + unique);
        System.out.println("Duplicate element: " + duplicates);
    }
    //================================================================================================

    public void printUniqueElement() {
        int arr[] = {10, 25, 13, 45, 12, 46, 12, 45, 25, 12, 48, 12};

        Set<Integer> seen = new LinkedHashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                seen.remove(num);
            }
        }
        System.out.println("Remove all duplicate: " + seen);
    }
}
