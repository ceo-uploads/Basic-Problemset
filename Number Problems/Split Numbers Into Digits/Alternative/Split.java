package test;

class Split {
    protected int num;

    public Split(int num) {
        this.num = num;
    }

    public void split(int num) {
        int temp = num;
        int count = 0;

        if (num < 0) {
            num += -num;
        }

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        for (int digit : digits) {
            System.out.println(digit + " ");
        }
    }
}
