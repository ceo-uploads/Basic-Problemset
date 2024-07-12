package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        number = input.nextInt();

        Split splitNumber = new Split(number);

        splitNumber.split(number);
    }
}