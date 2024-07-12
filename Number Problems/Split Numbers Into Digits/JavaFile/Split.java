package JavaFile;

import java.util.ArrayList;

class Split {
    protected int num;

    public Split(int num) {
        this.num = num;
    }

    public int getNumber(int num) {
        return num;
    }

    public void split(int num) {
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(num);

        String numString = array.toString();

        for (int i = 0; i < numString.length(); ++i) {
            System.out.println(numString.charAt(i));
        }
    }
}