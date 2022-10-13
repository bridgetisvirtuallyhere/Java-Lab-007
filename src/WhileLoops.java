import java.util.Scanner;
/*
* @author Bridget Acosta
* 10/12/2022
 */
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() { //In the WhileLoops class, write a method named eoCount

        int even = 0;
        int odd = 0;

        System.out.println("Type a number:");

        int numbers;
        while (true) {
            numbers = Integer.parseInt(s.nextLine());

            if (numbers % 2 == 1) {
                odd++; // and counts the even and odd numbers
            }
            if (numbers % 2 == 0) {
                even++;
            }
            if (numbers == 0) {
                break;
            }
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
            System.out.println("Type another number (0 to exit): ");
            }
        }

    public static double mean() {   // In the WhileLoops class, write a method named mean

        int i = 0;
        float sum = 0;

        System.out.println("Enter the size of array: ");
        int n = s.nextInt(); //that contains a while loop reads in integers from System.in
        float arr[] = new float[n];
        System.out.println("Enter " + n + " numbers: ");
        while(i<n) { //and calculates the mean of the numbers entered.
            arr[i] = s.nextInt();
            sum += arr[i];
            i++;
        }
        float average = sum/n;
        System.out.println("Average of the numbers is : "+average);
        return 0;
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
