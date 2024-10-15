package Daspro;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Diskusi {
    public static void main(String[] args) throws NumberFormatException,IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String kodeJaket =  null;
        String kodeUkuran = null;
        String merk = null;
        String namaUkuran = null;
        int harga = 0;
        int jumlah = 0;
        int totalBayar = 0;
        int pilihan;

        System.out.println("Pilih program yang mau dipilih : ");
        System.out.println("1. Diskusi 1");
        System.out.println("2. Diskusi 2");
        System.out.print("Masukan angka [1/2] : ");
        pilihan = Integer.parseInt(input.readLine());

        switch (pilihan) {
            case 1:
                System.out.println("Diskusi 1");
                System.out.print("Masukan kode jaket [E/P/H]  : ");
                kodeJaket = input.readLine().toUpperCase();
                System.out.print("Masukan kode ukuran [S/M/L] : ");
                kodeUkuran = input.readLine().toUpperCase();
                // Kondisi
                if (kodeJaket.equals("E")){
                    if(kodeUkuran.equals("S")){
                        harga = 150000;
                    } else if (kodeUkuran.equals("M")) {
                        harga = 220000;
                    } else if (kodeUkuran.equals("L")) {
                        harga = 250000;
                    } else {
                        System.out.print("Kode anda salah");
                    }
                } else if (kodeJaket.equals("P")) {
                    if(kodeUkuran.equals("S")){
                        harga = 100000;
                    } else if (kodeUkuran.equals("M")) {
                        harga = 125000;
                    } else if (kodeUkuran.equals("L")) {
                        harga = 165000;
                    } else {
                        System.out.print("Kode anda salah");
                    }
                } else if (kodeJaket.equals("H")) {
                    if(kodeUkuran.equals("S")){
                        harga = 110000;
                    } else if (kodeUkuran.equals("M")) {
                        harga = 130000;
                    } else if (kodeUkuran.equals("L")) {
                        harga = 170000;
                    } else {
                        System.out.print("Kode anda salah");
                    }
                } else {
                    System.out.print("Kode anda salah");
                }
                System.out.print("Harga jaket tersebut adalah Rp. " + harga);
                break;
            case 2:
                System.out.println("Diskusi 2");
                System.out.print("Masukan kode jaket [E/P/H]  : ");
                kodeJaket = input.readLine().toUpperCase();
                System.out.print("Masukan kode ukuran [S/M/L] : ");
                kodeUkuran = input.readLine().toUpperCase();
                System.out.print("Masukan jumlah              : ");
                jumlah = Integer.parseInt(input.readLine());
                //Kondisi
                if(kodeJaket.equals("E")){
                    merk = "Eiger";
                    if (kodeUkuran.equals("S")){
                        namaUkuran = "Small";
                        harga = 150000;
                    } else if (kodeUkuran.equals("M")) {
                        namaUkuran = "Medium";
                        harga = 220000;
                    } else if (kodeUkuran.equals("L")) {
                        namaUkuran = "Large";
                        harga = 250000;
                    } else {
                        System.out.print("kode anda salah");
                    }
                } else if (kodeJaket.equals("P")) {
                    merk = "Polo";
                    if (kodeUkuran.equals("S")){
                        namaUkuran = "Small";
                        harga = 100000;
                    } else if (kodeUkuran.equals("M")) {
                        namaUkuran = "Medium";
                        harga = 125000;
                    } else if (kodeUkuran.equals("L")) {
                        namaUkuran = "Large";
                        harga = 165000;
                    } else {
                        System.out.print("kode anda salah");
                    }
                } else if (kodeJaket.equals("H")) {
                    merk = "Hermes";
                    if (kodeUkuran.equals("S")){
                        namaUkuran = "Small";
                        harga = 150000;
                    } else if (kodeUkuran.equals("M")) {
                        namaUkuran = "Medium";
                        harga = 220000;
                    } else if (kodeUkuran.equals("L")) {
                        namaUkuran = "Large";
                        harga = 250000;
                    } else {
                        System.out.print("kode anda salah");
                    }
                } else {
                    System.out.print("Kode tidak ditemukan");
                }

                totalBayar = jumlah * harga;

                    System.out.println("--------------------------------------");
                    System.out.println("Merk Jaket Yang Dibeli : " + merk);
                    System.out.println("Ukuran                 : " + namaUkuran);
                    System.out.println("Harga Jaket            : Rp. " + harga);
                    System.out.println("Jumlah Beli            : " + jumlah);
                    System.out.println("--------------------------------------");
                    System.out.println("Total Bayar            : Rp. " + totalBayar);
                break;
            default:
                System.out.println("Anda hanya bisa pilih angka 1 atau 21");
        }
    }
}
