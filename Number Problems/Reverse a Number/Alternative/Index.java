package Alternative;
import java.util.Scanner;

class Index {
    public static void main(String[] args) {
        int num;
        int ans = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        num = input.nextInt();

        while (num != 0) {
            int mod = num % 2;
            ans = ans * 10 + mod;
            num = num/10;
        }

        System.out.println("Numbers Before Reverse: " + num);
        System.out.println("Numbers After Reverse: " + ans);
    }
}