package Daspro2;

public class PerkalianMatrix {
    public static void main(String[] args) {
        int[][] matriksA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matriksB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] hasil = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        System.out.println("Hasil Perkalian Matriks A x Matriks B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
