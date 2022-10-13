import java.util.Scanner;

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

    }
    public static void factorial() {
    }

    public static void main(String[] args) {

        rangeSum();
        factorial();
    }
}
// System.out.println("Number? ");
//        int firstInput = Integer.parseInt(s.nextLine());
//        System.out.println("Number? ");
//        int secondInput = Integer.parseInt(s.nextLine());
//        int range = 0;
//        for (int i = firstInput; i <= secondInput; i++) {
//            range += i;
//        }
//        System.out.println("The sum of the range is: " + range);
//        return range;
//        //and prints the range.
//        //Your program should not care if the smaller or larger numbers are entered first: