public class TableAndChairs {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 22;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // First two rows: just legs on both sides
                if ((i == 1 || i == 2) && (j == 1 || j == 22)) {
                    System.out.print("X");
                }

                // Table top (row 3) (10 star - 6 spaces = j 16)
                else if (i == 3 && (j >= 7 && j <= 16)) {
                    System.out.print("X");
                }
                else if (i == 3 && (j == 1 || (j >= 7 && j <= 16) || j == 22)) {
                    System.out.print("X");
                }

                // Row 4: left seat, right seat, and table sides
                else if (i == 4 && ((j >= 1 && j <= 5) || j == 7 || j == 16 || (j >= 18 && j <= 22))) {
                    System.out.print("X");
                }

                // Row 5 og 6: chair legs (5 right side) (18 right side) and table sides (7- left side legs) (16- right side legs) and chair legs 
                else if ((i == 5 || i == 6) &&
                        (j == 1 || j == 5 || j == 7 || j == 16 || j == 18 || j == 22)) {
                    System.out.print("X");
                }

               //space ni siya
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}