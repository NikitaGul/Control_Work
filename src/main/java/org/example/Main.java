package org.example;

public class Main {

    public int[][] matrix1;
    public int[][] matrix2;

    int[][] resultMatrix;

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int[][] getResultMatrix() {
        return resultMatrix;
    }

    public void setResultMatrix(int[][] resultMatrix) {
        this.resultMatrix = resultMatrix;
    }

    public Main(int[][] matrix1, int[][] matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        resultMatrix = new int[matrix1.length][matrix1[0].length];
    }

    public void resultOfAdd(){
        resultMatrix = MatrixOperation.addMatrix(matrix1, matrix2);
    }

    public void resultOfSub(){
        resultMatrix = MatrixOperation.subMatrix(matrix1, matrix2);
    }

    public void transperingMatrix(Main matrix){

        MatrixOperation.Transparing(matrix);
    }

    public void printResultMatrix(Main matrix){
        MatrixOperation.printMatrix(matrix);
    }

    public static void main(String[] args) {

        //System.out.printf("Hello and welcome!");

        int[][] matrix1 = {{4, 2},
                {9, 0}};
        int[][] matrix2 = {{3, 1},
                {-3, 4}};

        Main matrixResult = new Main(matrix1, matrix2);

        matrixResult.resultOfAdd();
        matrixResult.printResultMatrix(matrixResult);

        matrixResult.resultOfSub();
        matrixResult.printResultMatrix(matrixResult);

        matrixResult.transperingMatrix(matrixResult);
        matrixResult.printResultMatrix(matrixResult);

    }
}