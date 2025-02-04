package InterviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        HashMap<String, String> studentGrades = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Get student names and grades from user input
        for (int i = 0; i < 3; i++) { // Let's get grades for 3 students
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter " + name + "'s grade: ");
            String grade = scanner.nextLine();
            studentGrades.put(name, grade);
        }

        // Print the student grades
        System.out.println("\nStudent Grades:");
        for (String name : studentGrades.keySet()) {
            String grade = studentGrades.get(name);
            System.out.println(name + ": " + grade);
        }

        // Look up a specific student's grade
        System.out.print("\nEnter a student name to look up their grade: ");
        String studentName = scanner.nextLine();
        if (studentGrades.containsKey(studentName)) {
            String grade = studentGrades.get(studentName);
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
