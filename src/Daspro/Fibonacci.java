package Daspro;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
        int batas = input.nextInt();

        int angka1 = 0;
        int angka2 = 1;
        System.out.print("Deret Fibonacci: " + angka1 + " " + angka2);

        for(int i = 2; i < batas; i++){
            int deret = angka1 + angka2;
            System.out.print(" " + deret);
            angka1 = angka2;
            angka2 = deret;
        }
    }
}
