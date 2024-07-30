package Java Problemset.Array Problems.Sum of the Elements in the Array;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Enter The Size of Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (i = 0; i < n; ++i) {
            System.out.print("Enter the Element [" + (i + 1) + "] = ");
            arr[i] = input.nextInt();
        }

        Check numbers = new Check();

        numbers.check(arr);

        System.out.println("Sum of the Elements in the Array: " + numbers.getSum());
    }

}
