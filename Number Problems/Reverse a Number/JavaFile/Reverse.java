package JavaFile;

class Reverse {
    protected int num;

    public Reverse(int num) {
        this.num = num;
    }

    public void reverse(int num) {
        String strNum = Integer.toString(num);

        for (int i = strNum.length() - 1; i >= 0; i--) {
            System.out.print(strNum.charAt(i));
        }
    }
}