import java.util.Arrays;

public class ValueSwap {
    public static void main(String[] args) {
        int[] array = {6,4,12,9,45,23,2,43,56,17,20,11,7};

        System.out.println("\nArray before sort:\n");
        System.out.println(Arrays.toString(array));
        System.out.println("-".repeat(50));

        int[] answer = swap(array);

        System.out.println("\nArray after sort:\n");
        System.out.println(Arrays.toString(answer));
        System.out.println("-".repeat(50));
    }

    public static int[] swap(int[] input) {

        int smallValueIndex = 0;
        int largeValueIndex = 0;
        int smallValue = input[0];
        int largeValue = input[input.length - 1];

        for (int i = 0; i < input.length; i++) {
            if (input[i] < smallValue) {
                smallValue = input[i];
                smallValueIndex = i;
            }

            if (input[i] > largeValue) {
                largeValue = input[i];
                largeValueIndex = i;
            }
        }

        input[smallValueIndex] = input[0];
        input[0] = smallValue;
        input[largeValueIndex] = input[input.length - 1];
        input[input.length - 1] = largeValue;

        return input;
    }
}
