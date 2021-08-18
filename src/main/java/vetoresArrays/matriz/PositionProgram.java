package vetoresArrays.matriz;

import java.util.Scanner;

public class PositionProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i =0; i < mat.length; i++) {
            for (int j =0; j < mat.length; i++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i =0; i < mat.length; i++) {
            for (int j =0; j < mat.length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + ", "+ j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                }
            }
        }
    }
}