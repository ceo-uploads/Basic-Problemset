package Java Problemset.Array Problems.Largest Element in the Array;

class Check {
    protected int Largest = 0;

    public void check(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            }
        }
    }

    public int getLargest() {
        return Largest;
    }
}
