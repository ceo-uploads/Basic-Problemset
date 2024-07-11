package JavaFile;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a, b;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Firsrt Number: ");
        a = input.nextInt();
        System.out.print("Enter Second Number: ");
        b = input.nextInt();

        Swap swapNumber = new Swap(a, b);

        swapNumber.swapNum(a, b);
    }
}