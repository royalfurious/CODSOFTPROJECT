import java.util.Scanner;

public class StudentGradeConverter {
   public StudentGradeConverter() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Welcome to the Simple Grade Calculator!");
      System.out.print("Enter the subject name: ");
      String var2 = var1.nextLine();
      System.out.print("Enter the student's score (out of 100): ");
      int var3 = var1.nextInt();
      String var4;
      if (var3 >= 90) {
         var4 = "A+ (Excellent)";
      } else if (var3 >= 80) {
         var4 = "A (Very Good)";
      } else if (var3 >= 70) {
         var4 = "B (Good)";
      } else if (var3 >= 60) {
         var4 = "C (Average)";
      } else if (var3 >= 50) {
         var4 = "D (Below Average)";
      } else {
         var4 = "F (Fail)";
      }

      System.out.println("Subject: " + var2);
      System.out.println("Score: " + var3);
      System.out.println("Grade: " + var4);
      var1.close();
   }
}
