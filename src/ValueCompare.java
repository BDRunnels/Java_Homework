import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ValueCompare {
    public static void main(String[] args) {

        // Declare and instantiate new random instance
        Random random = new Random();

        // Declare and initialize data structures
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];

        // Populate int[] with random number.
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(101);
            arr2[i] = random.nextInt(101);
        }

        // Print arrays before
        printArrays(arr1, arr2);

        // Finding common elements
        System.out.println("\nElements Common in Both Arrays:");
        List<Integer> commonList = findCommonElements(arr1, arr2);
        System.out.println(commonList + "\n");

        // Printing unique elements in each array
        printUniqueElements(commonList, arr1, arr2);
    }

    public static void printArrays(int[] arr1, int[] arr2) {
        System.out.println("-".repeat(50));
        System.out.println("\nArray 1:\n " + Arrays.toString(arr1));
        System.out.println("\nArray 2:\n " + Arrays.toString(arr2) + "\n");
        System.out.println("-".repeat(50));
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {

        // Declare ArrayList to hold common elements
        List<Integer> commonArray = new ArrayList<>();

        // Nested for-each loops, finding matching values in both arrays and avoiding duplicate values in ArrayList
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j && !commonArray.contains(i)) {
                    commonArray.add(i);
                }
            }
        }

        return commonArray.size() > 0 ? commonArray : null;
    }

    public static void printUniqueElements(List<Integer> commonList, int[] arr1, int[] arr2) {

        if (commonList == null) {
            System.out.println("No common elements found. All values are unique in each array.\n");
        } else {
            System.out.println("Unique Elements in Array 1:");
            for (int i : arr1) {
                if (!commonList.contains(i)) {
                    System.out.print(i + "  ");
                }
            }

            System.out.println("\n\nUnique Elements in Array 2:");
            for (int j : arr2) {
                if (!commonList.contains(j)) {
                    System.out.print(j + "  ");
                }
            }
        }
        System.out.println("\n");
        System.out.println("-".repeat(50));
    }
}
