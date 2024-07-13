package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int number = input.nextInt();

        Split result = new Split(number);

        result.split(number);
    }
}