package JavaFile;

public class Factor {
    protected int a, n;

    public Factor(int a, int n) {
        this.a = a;
        this.n = n;
    }

    public int getFirstNum(int a) {
        return a;
    }

    public int getSecondNum(int n) {
        return n;
    }

    public void calculate(int a, int n) {
        int q = a / n;
        int r = a - (q * n);

        if (r == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
