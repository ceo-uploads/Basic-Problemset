package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int number = input.nextInt();

        Pattern check = new Pattern(number);

        check.Print(number);
    }
}