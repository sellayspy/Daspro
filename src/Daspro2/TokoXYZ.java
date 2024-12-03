package Daspro2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TokoXYZ {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //variabel
        String namaBarang;
        String jenisBarang;
        int jumlahBarang;
        double ukuranBarang;
        double hargaSatuan = 0;
        double diskon = 0;
        double totalHarga = 0;
        double totalBayar = 0;
        String orderLagi = "ya";

        double grandTotalHarga = 0,grandTotalDiskon = 0,grandTotalBayar = 0;

        System.out.println("-----------------------------------------------");
        System.out.println("-------------- Program Aplikasi ---------------");
        System.out.println("-----------------------------------------------");

        //inputan
        do {
            System.out.print("Masukan nama barang\t\t\t : ");
            namaBarang = input.readLine();
            System.out.print("Masukan Jenis barang\t\t : ");
            jenisBarang = input.readLine();
            System.out.print("Masukan ukuran barang\t\t : ");
            ukuranBarang = Double.parseDouble(input.readLine());
            System.out.print("Masukan jumlah barang\t\t : ");
            jumlahBarang = Integer.parseInt(input.readLine());

        //Logika
        if(namaBarang.equalsIgnoreCase("Madu")){
            if (jenisBarang.equalsIgnoreCase("Murni")){
                if (ukuranBarang == 380){
                    hargaSatuan = 70000;
                } else if (ukuranBarang == 760) {
                    hargaSatuan = 130000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Imun")) {
                if (ukuranBarang == 380){
                    hargaSatuan = 75000;
                } else if (ukuranBarang == 760) {
                    hargaSatuan = 145000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Herbal")) {
                if (ukuranBarang == 380){
                    hargaSatuan = 85000;
                } else if (ukuranBarang == 760) {
                    hargaSatuan = 165000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Hexabrin")) {
                if (ukuranBarang == 380){
                    hargaSatuan = 95000;
                } else if (ukuranBarang == 760) {
                    hargaSatuan = 180000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Gold")) {
                if (ukuranBarang == 380){
                    hargaSatuan = 105000;
                } else if (ukuranBarang == 760) {
                    hargaSatuan = 200000;
                }
            }
        } else if (namaBarang.equalsIgnoreCase("Herbal")) {
            if (jenisBarang.equalsIgnoreCase("Saffron")){
                if (ukuranBarang == 0.5){
                    hargaSatuan = 150000;
                } else if (ukuranBarang == 1.0) {
                    hargaSatuan = 300000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Propolis")) {
                if (ukuranBarang == 7.0){
                    hargaSatuan = 85000;
                } else if (ukuranBarang == 14.0) {
                    hargaSatuan = 165000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Probiotik")) {
                if (ukuranBarang == 80){
                    hargaSatuan = 50000;
                } else if (ukuranBarang == 160) {
                    hargaSatuan = 95000;
                }
            } else if (jenisBarang.equalsIgnoreCase("Bee Polen")) {
                if (ukuranBarang == 180){
                    hargaSatuan = 95000;
                } else if (ukuranBarang == 360) {
                    hargaSatuan = 180000;
                }
            }
        }

            totalHarga = hargaSatuan * jumlahBarang;

        grandTotalHarga += totalHarga;

        if (grandTotalHarga >= 1000000){
            diskon = grandTotalHarga * (2.5/100);
        }

        grandTotalDiskon += diskon;

        totalBayar = totalHarga - diskon;

        grandTotalBayar += totalBayar;

            System.out.print("Order Barang Lain <Ya/Tidak> : ");
            orderLagi = input.readLine();
        } while (orderLagi.equalsIgnoreCase("ya"));

        //Tampilan
        System.out.println("-----------------------------------------------");
        System.out.println("Total Harga \t\t\t\t : Rp. " + grandTotalHarga);
        System.out.println("Diskon\t\t\t\t\t     : Rp. " + grandTotalDiskon);
        System.out.println("Total Bayar \t\t\t\t : Rp. " + grandTotalBayar);
        System.out.println("-----------------------------------------------");

    }
}
