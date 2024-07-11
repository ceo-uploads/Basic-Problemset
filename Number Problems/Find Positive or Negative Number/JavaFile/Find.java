package JavaFile;

public class Find {
    private int getNum;

    public Find(int num) {
        this.getNum = num;

        String show = res(num);
        System.out.println("The Number is:- " + show);
    }

    public static String res(int num) {
        String msg;
        if (num < 0) {
            msg = "Negative Number";
        } else if (num > 0) {
            msg = "Positive Number";
        } else {
            msg = "Zero";
        }

        return msg;
    }
}
