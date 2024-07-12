package JavaFile;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Terms: ");
        a = input.nextInt();

        iterate number = new iterate(a);

        number.sum(a);
    }
}