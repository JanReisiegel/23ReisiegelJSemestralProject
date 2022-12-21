/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reisiegel.Jan.SemestralProject;

import java.util.Scanner;

/**
 * MatrixTools class works with matrices
 * @author janreisiegel
 * @version 1.0.0.21122022
 */
public class MatrixTools {

    static Scanner sc = new Scanner(System.in);

    private MatrixTools() {
    }

    /**
     * Method to rotate matrix by 90 degrees
     * @param matrix Matrix to rotate
     * @param method How many degrees to matrix will be rotated (-1 for -90 degres, 1 for 90 degres and 0 for non rotate) 
     * @return Rotated matrix
     */
    public static int[][] matrixTransform(int[][] matrix, int method) {
        int[][] transformedMatrix =new int[matrix[0].length][matrix.length];        
        if (method == 1) {
            for (int i = 0; i < transformedMatrix.length; i++) {
                for (int j = 0; j < transformedMatrix[i].length; j++) {
                    transformedMatrix[i][j] = matrix[j][matrix[0].length - 1 - i];
                }
            }
            return transformedMatrix;
        } else if (method == -1) {
            for (int i = 0; i < transformedMatrix.length; i++) {
                for (int j = 0; j < transformedMatrix[i].length; j++) {
                    transformedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
                }
            }
            return transformedMatrix;
        }
        return matrix;
    }

    /**
     * Method that reads a matrix from user by rows
     * @param n Number of rows
     * @param m Number of columns
     * @return Matrix with n rows and m columns
     */
    public static int[][] loadInt(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    
    /**
     * Method to write matrix to console
     * @param matrix The matrix of Double values to be printed
     */
    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%6.2f", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    //pretizeni metody, overload
    /**
     * Method to write matrix to console
     * @param matrix The matrix of Integer values to be printed
     */
    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%6d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
