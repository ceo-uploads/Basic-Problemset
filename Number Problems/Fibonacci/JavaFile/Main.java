package JavaFile;;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter How Terms: ");
        int number = input.nextInt();

        Check result = new Check(number);

        result.check(number);
    }
}