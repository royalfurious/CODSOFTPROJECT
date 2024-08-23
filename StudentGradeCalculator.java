import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+ (Excellent)";
        } else if (averagePercentage >= 80) {
            grade = "A (Very Good)";
        } else if (averagePercentage >= 70) {
            grade = "B (Good)";
        } else if (averagePercentage >= 60) {
            grade = "C (Average)";
        } else if (averagePercentage >= 50) {
            grade = "D (Below Average)";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
