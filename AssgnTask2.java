//Assignment Task 02: Row Rotation Policy
class AssgnTask2 {

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int steps = examWeek - 1;

        
        for (int i = 0; i < steps; i++) {
            String[] temp = matrix[row - 1]; 
            for (int j = row - 1; j > 0; j--) {
                matrix[j] = matrix[j - 1]; 
            }
            matrix[0] = temp; 
        }

        Integer r = 0;
        for (int p = 0; p < row; p++) {
            for (int q = 0; q < col; q++) {
                if (matrix[p][q].equals("AA")) {
                    r = p + 1; 
                }
            }
        }

        return r;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"},
                {"P", "Q", "R", "S", "T"},
                {"U", "V", "W", "X", "Y"},
                {"Z", "AA", "BB", "CC", "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}
