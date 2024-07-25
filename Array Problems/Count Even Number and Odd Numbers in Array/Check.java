package Java Problemset.Array Problems.Count Even Number and Odd Numbers in Array;

class Check {
    protected int oddCount = 0;
    protected int evenCount = 0;

    public void check(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
    }

    public int getOddCount() {
        return oddCount;
    }

    public int getEvenCount() {
        return evenCount;
    }
}
