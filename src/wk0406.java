public class wk0406 {
    public static void main(String[] args){

        // declare and initialize nested int array
        int[][] myNumbers = new int[3][5];
        
        // Populate array
        int pop = 0;

        for (int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; j++) {
                myNumbers[i][j] = ++pop;
            }
        }
        
        // Print formatted array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < myNumbers[i].length; j++) {
                    System.out.print(
                        j == 4 ? myNumbers[i][j] + " |\n" : myNumbers[i][j] + ", "
                    );
            }
        }
    }
}


