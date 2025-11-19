
import java.util.Scanner;

public class arrayAverageScore21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] score = new int[numStudents];
        int passedCount = 0, failedCount = 0;
        double passedTotal = 0, failedTotal = 0, averagePassed = 0, averagefailed = 0;
        

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the final score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                passedTotal += score[i];
                passedCount++;
            } else {
                failedTotal += score[i];
                failedCount++;
            }
        }

       if (passedCount > 0) {
        averagePassed = passedTotal / passedCount;
       } if (failedCount > 0) {
        averagefailed = failedTotal / failedCount;
       }

       System.out.println("The average score of students who passed is " + averagePassed);
       System.out.println("The average score of students who failed is " + averagefailed);

        sc.close();
    }
}
