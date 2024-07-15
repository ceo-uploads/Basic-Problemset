package JavaFile;

class Pattern {
    protected int num;

    public Pattern (int num) {
        this.num = num;
    }

    public void Print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
