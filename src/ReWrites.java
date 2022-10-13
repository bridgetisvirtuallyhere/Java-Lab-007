import java.util.Scanner;
/*
@author Bridget Acosta
10/13/2022
 */
class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() { //In a class named ReWrites, rewrite the while loops in the avgRewrite method
        // as a for loop instead of a while loop.

        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        //while(!(l = s.nextLine()).toUpperCase().equals("Q"))
        for (l = s.nextLine(); !l.toUpperCase().equals("Q"); l = s.nextLine()){
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {
                throw new RuntimeException(nfe);
            }
        }

        System.out.printf("Average is: %f%n", (sum/count));
    }
    public static void sumRewrite() { //In a class named ReWrites, rewrite the while loops in the sumRewrite method
        // without the break condition and the boolean true in the parenthesis.
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = 1;
        int sum = 0;

        while (x > 0) {
            try {
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {
                throw new RuntimeException(nfe);
            }
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}