package JavaFile;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int num;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        num = input.nextInt();

        checkingMethod(num);
    }

    public static void checkingMethod(int num) {
        
        if (num % 2 == 0) {
            System.out.println("The number - "+num+" is Even");
        }
        else if(num % 2 != 0){
            System.out.println("The number - "+num+" is Odd");
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}