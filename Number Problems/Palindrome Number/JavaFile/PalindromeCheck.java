package JavaFile;

class PalindromeCheck {
    protected int num;

    public PalindromeCheck(int num) {
        this.num = num;
    }

    public void check(int num) {
        int ans = 0;
        int number = num;

        while (num != 0) {
            int mod = num % 10;
            ans = ans * 10 + mod;
            num /= 10;
        }

        if (ans == number) {
            System.out.println("Palindrome Number detected..");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}