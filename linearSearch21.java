import java.util.Scanner;

public class linearSearch21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int elements = sc.nextInt();
        
        double[] arrayElement = new double[elements];
        double key = 20;
        int result = 0;

        for (int i = 0; i < elements; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayElement[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key you want to search for: ");
        key = sc.nextDouble();

        for (int i = 0; i < arrayElement.length; i++) {
            if (arrayElement[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println("The key in the array is located at index position " + result);

        sc.close();
    }
}