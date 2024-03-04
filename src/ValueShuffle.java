import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ValueShuffle {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        //populate arrays
        populateArrays(arr1, arr2);

        //print arrays
        printArrays(arr1, arr2, "BEFORE");

        //shuffle arrays to less than or equal to 50 && more than 50
        shuffleAndSortArrays(arr1, arr2);

    }

    public static void populateArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arr1.add(random.nextInt(101));
            arr2.add(random.nextInt(101));
        }
    }

    public static void printArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2, String type) {
         switch(type) {
            case "BEFORE" -> System.out.println("\nBEFORE SHUFFLE:\n\n" + "Array 1: " + arr1 + "\n" + "Array 2: " + arr2 + "\n");
            case "AFTER" -> System.out.println("\nAFTER SHUFFLE:\n\n" + "Array < 51: " + arr1 + "\n" + "Array > 50: " + arr2 + "\n");
            default -> System.out.println("Invalid Argument for parameter 'type'");
        };
        
    }

    public static void shuffleAndSortArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> arrLessThan51 = new ArrayList<>();
        ArrayList<Integer> arrMoreThan50 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int currentElement1 = arr1.get(i);
            int currentElement2 = arr2.get(i);

            if (currentElement1 > 50 && currentElement2 > 50) {
                arrMoreThan50.add(currentElement1);
                arrMoreThan50.add(currentElement2);
            } else if (currentElement1 > 50 && currentElement2 <= 50) {
                arrMoreThan50.add(currentElement1);
                arrLessThan51.add(currentElement2);
            } else if (currentElement1 <= 50 && currentElement2 > 50) {
                arrMoreThan50.add(currentElement2);
                arrLessThan51.add(currentElement1);
            } else {
                arrLessThan51.add(currentElement1);
                arrLessThan51.add(currentElement2);
            }
        }

        printArrays(arrLessThan51, arrMoreThan50, "AFTER");
        sortArrays(arrLessThan51, arrMoreThan50);
    }

    public static void sortArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        arr1.sort(Comparator.naturalOrder());
        arr2.sort(Comparator.naturalOrder());

        System.out.println("SORTED ARRAYS:\n\n" + "Array < 51: " + arr1 + "\n" + "Array > 50: " + arr2 + "\n");
    }
}
