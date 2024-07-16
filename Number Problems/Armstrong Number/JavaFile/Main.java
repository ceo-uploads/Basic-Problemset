package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int number = input.nextInt();

        Armstrong result = new Armstrong(number);

        result.check(number);
    }
}