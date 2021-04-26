package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] b = {3,2,9,3,7,11,15,13,23,27,32,35,36,37};
        int[] c = {1,3,5,7,11,13,15,17,19,21,23,27,35,37};
        int[] d = {9,17,32,7,2,3,1,45,46,47,55,60,6,17};

        Main app = new Main();
	    Solution solution = new Solution();
        Integer[] result = solution.solution(a, b, c, d);

        for(Integer i: result)
            System.out.println(i + " ");

        System.out.println();

        int[][] arr2D = new int[3][3];
        int k = 1;
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                arr2D[i][j] = k;
                k++;
            }
        }

        Transpose trn = new Transpose();
        int[][] transposedMatrix = trn.transpose(arr2D);

        for (int i = 0; i < transposedMatrix.length; i++){
            for (int j = 0; j < transposedMatrix[0].length; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
