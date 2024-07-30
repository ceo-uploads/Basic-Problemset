package Java Problemset.Array Problems.Sum of the Elements in the Array;

class Check {
    protected int sum = 0;

    public void check(int[] numbers) {
        for (int number : numbers) {
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }
}
