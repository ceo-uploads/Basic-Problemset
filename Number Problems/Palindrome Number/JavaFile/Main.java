package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int number = input.nextInt();

        PalindromeCheck result = new PalindromeCheck(number);

        result.check(number);

    }
}