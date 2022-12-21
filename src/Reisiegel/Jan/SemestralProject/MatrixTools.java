/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reisiegel.Jan.SemestralProject;

import java.util.Scanner;

/**
 *
 * @author jan
 */
public class MatrixTools {

    static Scanner sc = new Scanner(System.in);

    private MatrixTools() {
    }
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Pocet radku: ");
            int n = sc.nextInt();
            if (n <= 0) {
                return;
            }
            System.out.println("Pocet sloupcu: ");
            int m = sc.nextInt();
            System.out.println("Zadejte hodnoty matice: ");
            int[][] matrix = loadInt(n, m);
            System.out.println("Matice: ");
            display(matrix);
            while (true) {
                System.out.println("Zadej hodnotu transformace (-1=-90, 1=90 a 0=0): ");
                int tr = sc.nextInt();
                if (tr != 0 && Math.abs(tr) != 1) {
                    break;
                }
                matrix = matrixTransform(matrix, tr);
                System.out.println("Transformovana matice: ");
                display(matrix);
            }
        }
    }

    public static int[][] matrixTransform(int[][] matrix, int metoda) {
        int[][] transformedMatrix =new int[matrix[0].length][matrix.length];        
        if (metoda == 1) {
            for (int i = 0; i < transformedMatrix.length; i++) {
                for (int j = 0; j < transformedMatrix[i].length; j++) {
                    transformedMatrix[i][j] = matrix[j][matrix[0].length - 1 - i];
                }
            }
            return transformedMatrix;
        } else if (metoda == -1) {
            for (int i = 0; i < transformedMatrix.length; i++) {
                for (int j = 0; j < transformedMatrix[i].length; j++) {
                    transformedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
                }
            }
            return transformedMatrix;
        }
        return matrix;
    }

    public static int[][] loadInt(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%6.2f", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    //pretizeni metody, overload
    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%6d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
