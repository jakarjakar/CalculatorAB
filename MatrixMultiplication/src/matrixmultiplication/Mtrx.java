package matrixmultiplication;

import java.util.Scanner;
import static java.lang.System.out;

public class Mtrx {
     static Scanner in = new Scanner(System.in);
        
    public static double[][] fill(int size) {
        double [][] matrix0 = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out.println("Введите [" + i + ", " + j + "] элемент матрицы");
                matrix0[i][j] = in.nextInt();
            }
        }
        return matrix0;
    }
    
    public static int row() {
        out.println("Задайте количество строк: ");
        int row = in.nextInt();
        return row;
    }
    
    public static int column() {
        out.println("Задайте количество столбцов: ");
        int column = in.nextInt();
        return column;
    }

    public static double[][] fill(int row,int column) {
        double[][] m = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                out.println("Введите [" + i + ", " + j + "] элемент матрицы");
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }
        
    public static void print(double[][] mtrx) {
        out.println("Матрица: ");
        int r = mtrx.length;
        int c = mtrx[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                out.print(mtrx[i][j] + " ");
            }
        out.println(); // для переноса строки после окончания вывода строки матрицы
        }
    }
}

