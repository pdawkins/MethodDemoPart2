import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int val1 = input.nextInt();

        System.out.print("Enter the second value: ");
        int val2 = input.nextInt();

        System.out.println("Enter a third value: ");
        int val3 = input.nextInt();


        System.out.println("largest is " + larger(val1, val2, val3));
    }

    public static int larger(int a, int b){
        int result;
        if (a > b)
            result = a;
        else
            result = b;

        return result;
    }

    public static int larger(int a, int b, int c){
        int d = larger(a, b);
        int result;
        if (d > c)
            result = d;
        else
            result = c;

        return result;
    }

}