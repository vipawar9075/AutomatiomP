import org.testng.annotations.Test;

public class classE {

    @Test
    public static void classEMethod() {

//creating a matrix
        int original[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
//creating another matrix to store transpose of a matrix
        int transpose[][] = new int[3][3]; //3 rows and 3 columns
//Code to transpose a matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
    }
}