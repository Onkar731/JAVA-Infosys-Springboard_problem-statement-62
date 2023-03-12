public class MinimumSum {
    public static int findMinimumSum(int []array) {
        // declaring variables
        int sum = 0;
        int maxNumber = 0;

        // calculating sum
        for(int element : array) {
            if(element <= maxNumber) {
                maxNumber = element;
            }
            sum -= element;
        }
        sum += maxNumber;

        // returning sum 
        return Math.abs(sum + array[array.length - 1]);
    }
}