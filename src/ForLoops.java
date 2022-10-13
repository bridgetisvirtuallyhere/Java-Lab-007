import java.util.Scanner;
/*
*@author Bridget Acosta
* 10/13/2022
 */
public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static int forSum() { //In the ForLoops class, create a method named forSum
        //that calculates the sum 1+2+3+...+n where n is given as user input:
        System.out.println("Number? ");
        int input = Integer.parseInt(s.nextLine());
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
        return sum;
    }


    //In the ForLoops class, create a method named rangeSum
    public static int rangeSum() {
        //that sums a range/interval of numbers,
        System.out.println("Number? ");
        int firstInput = Integer.parseInt(s.nextLine());
        System.out.println("Number? ");
        int secondInput = Integer.parseInt(s.nextLine());
        int range = 0;
        if (firstInput < secondInput) {
            for (int i = firstInput; i <= secondInput; i++) {
                range += i;
                System.out.println("The sum of the range is: " + range);
            }
        } else {
            for (int i = secondInput; i <= firstInput; i++) {
                range += i;
                System.out.println("The sum of the range is: " + range);
            }
            //and prints the range.
            //Your program should not care if the smaller or larger numbers are entered first:
        }
        return firstInput;
    }

        public static void factorial () {//In the ForLoops class, implement a method named factorial
        //that calculates the factorial of a number read in from System.in
            System.out.println("Number? ");
            int input = Integer.parseInt(s.nextLine());
            int factorial = 1;
            for (int i = 2; i <= input; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial is: " + factorial);
        }

        public static void main (String[]args){
            forSum();
            rangeSum();
            factorial();
        }
    }
