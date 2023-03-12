import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting values
        int []array = Arrays.stream(inpuString.split(",")).mapToInt(Integer::parseInt).toArray();

        // printing minimum sum
        System.out.println(MinimumSum.findMinimumSum(array));

        // closing resource
        sc.close();
    }
}