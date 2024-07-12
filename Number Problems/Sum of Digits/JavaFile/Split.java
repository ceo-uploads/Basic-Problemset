package javaFile;

class Split {
    protected int num;

    public Split(int num) {
        this.num = num;
    }

    public int getNum(int num) {
        return num;
    }

    public void split(int num) {
        String numString = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }

        System.out.println(sum);
    }
}