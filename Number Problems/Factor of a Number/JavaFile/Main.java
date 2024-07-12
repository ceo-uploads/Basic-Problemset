package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a, n;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        a = input.nextInt();
        System.out.println("The Number to checkThe Factor: ");
        n = input.nextInt();

        Factor number = new Factor(a, n);

        number.calculate(a, n);
    }
}