package JavaFile;

public class Swap {
    protected int a,  b;

    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getFirstNum(int a){
        return a;
    }

    public int getSecondNum(int b){
        return b;
    }

    public void swapNum(int a, int b) {

        System.out.println("Numbers before Swapping - " +a+" and "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers After Swapping - "+a+" and "+b);
    }
}
