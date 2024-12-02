package org.example;

import java.util.Arrays;

class MatrixOperation {

    static int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            return null;
        }
        else{
            int[][] matrixResult = new int[matrix1.length][matrix1[0].length];

            for(int i = 0; i < matrix2.length; ++i){
                for(int j = 0; j < matrix2.length; ++j){
                    matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return matrixResult;
            }
    }

        static int[][] subMatrix(int[][] matrix1,int[][] matrix2){
            if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
                return null;
            }
            else{
                int[][] matrixResult = new int[matrix1.length][matrix1[0].length];

                for(int i = 0; i < matrix2.length; ++i){
                    for(int j = 0; j < matrix2.length; ++j){
                        matrix2[i][j] = matrix2[i][j] * -1;
                    }
                }

                matrixResult = addMatrix(matrix1, matrix2);

                return matrixResult;
            }
        }

        static void Transparing(Main matrix){
        int[][] resultMatrix = new int[matrix.getResultMatrix()[0].length][matrix.getResultMatrix().length];

        for(int i = 0; i < resultMatrix.length; ++i){
            for(int j = 0; j < resultMatrix[0].length; ++j){
                resultMatrix[i][j] = matrix.getResultMatrix()[j][i];
            }
        }
        matrix.setResultMatrix(resultMatrix);
        }

        static void printMatrix(Main matrix){
        for(int i = 0; i < matrix.getResultMatrix().length; ++i){

                System.out.println(Arrays.toString(matrix.getResultMatrix()[i]));
            }
        }


}
