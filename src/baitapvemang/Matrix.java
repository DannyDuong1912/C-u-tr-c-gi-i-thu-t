/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapvemang;

import java.util.Random;

public class Matrix {
   int n;
   int[][] matrixA, matrixB;

public Matrix(int n){
    this.n = n ;
    matrixA = new int[n][n];
    matrixB = new int[n][n];
    initValue();
}
public void initValue(){
    Random r = new Random();
    for (int i = 0; i < n; i++) {
        for(int j = 0 ; j < n ; j++){
        matrixA[i][j] = r.nextInt(10);
        matrixB[i][j] = r.nextInt(10);
    }
    }
}

    public void prinMatrix(int[][] matrix){
          System.out.println("Matrix:---------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" "); 
            }
              System.out.println();
        }

    }

    public void prinMatrixA(){
        prinMatrix(matrixA);
    }
        public void prinMatrixB(){
        prinMatrix(matrixB);
    }
        
    public static void main(String[] args) {
        Matrix m = new Matrix(5);
        m.prinMatrixA();
        m.prinMatrixB();
    }
}
