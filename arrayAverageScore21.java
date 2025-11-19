
import java.util.Scanner;

public class arrayAverageScore21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0, average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            } else {
                System.out.println("Student " + i + " Failed!");
            }

            total += score[i];
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);

        sc.close();
    }
}
