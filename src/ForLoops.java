import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static int forSum() { //In the ForLoops class, create a method named forSum
        //that calculates the sum 1+2+3+...+n where n is given as user input:
        System.out.println("Enter numbers: ");
    int n = Integer.parseInt(s.nextLine());
    int sum = 0;
    for(int i=1; 1<=n; i++){
        sum = sum + i;
    }
        System.out.println(sum);
        return n;
    }

    public static void rangeSum() {
    }

    public static void factorial() {
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
