package JavaFile;

class Pattern {
    protected int num;

    public Pattern(int num) {
        this.num = num;
    }

    public void Print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
