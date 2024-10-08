package Daspro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwithCase {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int pilihan;
        double luas = 0;

        //Output
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("         LUAS BANGUN DATAR");
        System.out.println("-----------------------------------");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("-----------------------------------");
        System.out.print("Masukan Pilihan anda <1/2/3> = ");
        pilihan = Integer.parseInt(input.readLine());

        switch (pilihan){
            case 1:
                System.out.println("LUAS PERSEGI PANJANG");
                System.out.print("Masukan panjang : ");
                int panjang = Integer.parseInt(input.readLine());
                System.out.print("Masukan Lebar   : ");
                int lebar = Integer.parseInt(input.readLine());
                luas = panjang * lebar;
                System.out.print("Luas Persegi    : " +luas + " cm");
                break;
            case 2:
                System.out.println("LUAS SEGITIGA");
                System.out.print("Masukan alas   : ");
                int alas = Integer.parseInt(input.readLine());
                System.out.print("Masukan tinggi : ");
                int tinggi = Integer.parseInt(input.readLine());
                luas = 0.5 * alas * tinggi;
                System.out.print("Luas Segitiga  : " +luas+ " cm");
                break;
            case 3:
                System.out.println("LUAS LINGKARAN");
                System.out.print("Masukan Jari-jari : ");
                int jari = Integer.parseInt(input.readLine());
                luas = 3.14 * (jari * 2);
                System.out.print("Luas Lingkaran    : " +luas+ " cm");
                break;
            default:
                System.out.println("Pilihan kamu salah coba pilih antara nomor 1, 2, dan 3");
        }


    }
}
