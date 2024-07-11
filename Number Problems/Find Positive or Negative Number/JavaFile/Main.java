package JavaFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to Find: ");
        number = input.nextInt();
        Find findNum = new Find(number);

        findNum.res(number);
    }
}