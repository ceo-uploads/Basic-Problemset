package JavaFile;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int num;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        num = input.nextInt();

        int absValue = absolute(num);

        System.out.println("Entered Number- "+num+" Absolute value: "+absValue);
    }

    public static int absolute(int num) {
        int newNumber = 0;

        if (num < 0) {
            newNumber += -num;
        }
        else {
            newNumber += num;
        }

        return newNumber;
    }
}