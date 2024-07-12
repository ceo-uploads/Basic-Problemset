package JavaFile;

public class iterate {
    protected int a;

    public iterate(int a) {
        this.a = a;
    }

    public int getFirstNum(int a){
        return a;
    }

    public void sum(int a) {
        int sum = 0;
        for(int i = 0; i <= a; ++i) {
            sum += i;
        }

        System.out.println("The Sum of The Natural Integers of " +a+ " term is:- "+sum);
    }
}
