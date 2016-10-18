package matrixmultiplication;
//@Date Oct 17, 2016
//@author Artsiom_Berazavik

import static java.lang.System.out;



public class MtrxRun {
    public static void main(String[] args) {
        out.println("Заполните 2 матрицы для последющего их умножения:");

        //Fill the First matrix
        int r0 = Mtrx.row();
        int c0 = Mtrx.column();
        double [][] m0 = Mtrx.fill(r0, c0);
        Mtrx.print(m0);
        
        //Fill the Second matrix
        int r1 = Mtrx.row();
        int c1 = Mtrx.column();
        double [][] m1 = Mtrx.fill(r1, c1);
        Mtrx.print(m1);
        
        if (c0 == r1) {
            double[][] m2 = Mult.result(m0, m1);
            Mtrx.print(m2);
        } else { 
            out.println("Невозможно умножить первую матрицу на вторую.");
        }
        
    }
}
