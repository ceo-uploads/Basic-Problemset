package JavaFile;

class Check {
    protected int num;

    public Check(int num) {
        this.num = num;
    }

    public void check(int num) {
        int a = 0;
        int b = 1;
        int n = num;

        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
