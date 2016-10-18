package matrixmultiplication;
 //@date Oct 18, 2016
 //@author Artsiom_Berazav
import java.util.Arrays;

public class Mult {
    public static int [][] result (int m0[][], int m1[][] ) {
        
        
        int length_m0_row = m0.length;
        int length_m0_column = m0[0].length;
        
//        int length_m1_row = m1.length;
        int length_m1_column = m1[0].length;
        int [][] m2 = new int[length_m0_row][length_m1_column];
        
        for (int i = 0; i < length_m0_row; i++) {
            for (int j = 0; j < length_m1_column; j++) {
                for (int k = 0; k < length_m0_column; k++) {
                    m2[i][j] = (m0[i][j] * m1[i][j]) + (m0[i][k] * m1[k][j]);
                    System.out.println("Hi" + Arrays.deepToString(m2));
                }
            }
        } 
        return m2;
    }
}

