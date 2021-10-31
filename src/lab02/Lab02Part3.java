package lab02;


import java.util.Random;
import java.util.Scanner;

//Zadanie 3.
public class Lab02Part3 {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar m: ");
        int m = sizeOrgarnizer();
        System.out.println("Podaj rozmiar n: ");
        int n = sizeOrgarnizer();
        System.out.println("Podaj rozmiar k: ");
        int k = sizeOrgarnizer();

        int[][] matrixA = matrixMaker(m,n);
        int[][] matrixB = matrixMaker(n,k);

        matrixPrint(matrixA);
        matrixPrint(matrixB);

        int[][] matrixC = multiply(matrixA,matrixB);
        matrixPrint(matrixC);
    }

    static int[][] matrixMaker(int m, int n){
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    static int sizeOrgarnizer(){
        Scanner scanner = new Scanner(System.in);
        int a;
        boolean inCorrectNumber = true;
        do{
            a = scanner.nextInt();
            if(a <= 10 && a >= 1){
                inCorrectNumber = false;
            }
        }while (inCorrectNumber);

        return a;
    }

    static void matrixPrint(int[][] matrix){
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] multiply(int[][] matrixA, int[][] matrixB){
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                matrixC[i][j] = multiplyCells(matrixA,matrixB,i,j);
            }
        }

        return matrixC;
    }

    static int multiplyCells(int[][] matrixA, int[][] matrixB, int row, int column){
        int cell = 0;
        for (int i = 0; i < matrixB.length; i++) {
            cell += matrixA[row][i] * matrixB[i][column];
        }
        return cell;
    }

}
