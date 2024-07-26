package Java Problemset.Array Problems.Largest and Smallest Element in the Array;

class Check {
    protected int Largest = 0;
    protected int Smallest;

    public void checkLargest(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            }
        }

        System.out.println("Largest Number is : " + Largest);
    }

    public void checkSmallest(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (Largest > numbers[i]) {
                Smallest = numbers[i];
            }
            Largest = Smallest;
        }

        System.out.println("Smallest Number is: " + Smallest);
    }

}
