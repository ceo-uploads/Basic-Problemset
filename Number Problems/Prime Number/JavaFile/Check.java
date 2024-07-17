package JavaFile;

class Check {
    protected int num;

    public Check(int num) {
        this.num = num;
    }

    public void check(int num) {
        Boolean flag = true;

        for (int i = 2; i < num; i++) {
            int mod = num % i;

            if (mod == 0) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}
