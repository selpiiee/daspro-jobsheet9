
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose: ");
        int Task = sc.nextInt();

        switch (Task) {
            case 1:
                Question.a();
                break;
            case 2:
                Question.b();
                break;
            case 3:
                Question.c();
                break;
        }
    }
}

class Question {

    static void a() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student grades to be entered: ");
        int numStudentGrades = sc.nextInt();

        int[] grade = new int[numStudentGrades];
        double average, total = 0, highest = 0, lowest = 100;

        for (int i = 0; i < numStudentGrades; i++) {
            System.out.print("Enter the each student's grade " + (i + 1) + ": ");
            grade[i] = sc.nextInt();

            total += grade[i];

            if (grade[i] > highest) {
                highest = grade[i];
            }
            if (grade[i] < lowest) {
                lowest = grade[i];
            }
        }

        average = total / numStudentGrades;

        System.out.print("All grades entered: [");

        for (int i = 0; i < numStudentGrades; i++) {
            System.out.print(grade[i]);
            if (i < numStudentGrades - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");

        System.out.println("Average grade: " + average);
        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);

        sc.close();
    }

    static void b() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int numOrders = sc.nextInt();
        sc.nextLine();

        String[] orderNames = new String[numOrders];
        double[] orderPrices = new double[numOrders];
        double total = 0;

        for (int i = 0; i < numOrders; i++) {
            System.out.println("Order " + (i + 1) + ": ");

            System.out.print("Enter the name of food or drink: ");
            orderNames[i] = sc.nextLine();

            System.out.print("Enter the price for " + orderNames[i] + ": ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine();

            total += orderPrices[i];
        }

        System.out.println("\n-------FINAL ORDER RECEIPT-------");
        System.out.println("List of orders: ");

        for (int i = 0; i < numOrders; i++) {
            System.out.println("  - " + orderNames[i] + "\t\tRp " + orderPrices[i]);
        }

        System.out.println("-----------------------------------");
        System.out.println("The total cost  \tRp " + total);

        sc.close();
    }

    static void c() {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodle", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        String searchKey;
        int position = -1;

        System.out.println("Enter the item name you want to search: ");
        searchKey = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchKey)) {
                position = i;
                break;
            }
        }

        System.out.println("-------------------------------------------------");
        if (position != -1) {
            System.out.println("The item " + searchKey + " - is AVAILABLE!");
            System.out.println("Found at menu index position: " + position);
        } else {
            System.out.println("The item " + searchKey + " - is NOT on the menu");
        }
        System.out.println("-------------------------------------------------");

        sc.close();
    }
}
