package JavFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int number = input.nextInt();

        Reverse rev = new Reverse(number);

        rev.reverse(number);
    }
}