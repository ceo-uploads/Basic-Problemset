package JavaFile;
import java.util.Scanner;

class Main {
  publc static void main(String[] arg) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter The Number of Length: ");
    int number = input.nextInt();

    Triangle tn = new Triangle(number);

    tn.view(number);
  }
}
