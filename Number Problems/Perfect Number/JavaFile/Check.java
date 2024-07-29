package JavaFile;

class Check {
    protected int num;

    public Check(int num) {
        this.num = num;
    }

    public void check(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            int mod = num % i;

            if (mod == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }
    }
}
