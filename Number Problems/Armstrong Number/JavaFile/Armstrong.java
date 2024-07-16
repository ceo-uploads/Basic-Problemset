package JavaFile;

class Armstrong {
    protected int num;

    public Armstrong(int num) {
        this.num = num;
    }

    public void check(int num) {
        int number = num;
        int temp = num;
        int count = 0;
        int sum = 0;

        if  (num < 0) {
            num += -num;
        }

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];

        for (int i = count -1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
            sum += (digits[i] * digits[i] * digits[i]);
        }

        System.out.println("The Qubic Sum of Digits: "+sum);
        if (sum == number) {
            System.out.println("Armstrong Number Detected");
        }
        else {
            System.out.println("Not Armstrong Number..");
        }
    }
}
