package JavaFile;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        Split splitNumber = new Split(num);

        splitNumber.split(num);
    }
}