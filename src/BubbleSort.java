import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        // Instantiate new random instance
        Random random = new Random();

        // Declare & initialize int array
        int[] arrayA = new int[12];

        // Populate int array with random number between 1 & 100.
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(1,101);
        }

        // Conditional statement boolean for `while` loop
        boolean swapped = true;
        
        // Outer loop & inner `swapping` loop, executing until no more swaps are made / array is sorted.
        while (swapped) {
            swapped = false;
            int i =0;
            
            while (i < arrayA.length - 1) {
                int j = i + 1;
                if (arrayA[i] > arrayA[j]) {
                    int temp = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = temp;
                    swapped = true;
                }
                i++;
            }
        }

        // Print out sorted array using Arrays.toString()
        System.out.println(Arrays.toString(arrayA));
    }
}
