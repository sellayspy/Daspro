package Daspro2;

import java.util.Scanner;

public class Operasi {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[][] dataJurusan = {
                {"20", "Manajemen"},
                {"21", "Akuntansi"},
                {"23", "Sistem Informasi"},
                {"24", "Informatika"}
        };

        int jumlahJurusan;

        System.out.print("Masukan Jumlah Jurusan : ");
        jumlahJurusan = Integer.parseInt(input.nextLine());

        String[] kodeJurusan = new String[jumlahJurusan];
        String[] namaJurusan = new String[jumlahJurusan];

        int[] jumlahHuruf = new int[jumlahJurusan];

        for(int i = 0; i < jumlahJurusan;i++){
            System.out.print("Masukan kode jurusan ke-" + (i + 1) + " : ");
            String kode = input.nextLine();

            String nama = "Tidak Ditemukan";
            for(String[] jurusan : dataJurusan) {
                if(jurusan[0].equals(kode)) {
                    nama = jurusan[1];
                    break;
                }
            }

            kodeJurusan[i] = kode;
            namaJurusan[i] = nama;
            jumlahHuruf[i] = nama.equals("tidak ditemukan") ? 0 : nama.replace(" ", "").length();
        }

        System.out.println("\nTabel Jurusan");
        System.out.printf("%-5s %-15s %-20s %-10s%n", "No", "Kode Jurusan", "Nama Jurusan", "Jumlah Huruf");
        System.out.println("-------------------------------------------------------------");

        for(int i = 0; i < jumlahJurusan;i++){
            System.out.printf("%-5d %-15s %-20s %-10d%n", (i + 1), kodeJurusan[i], namaJurusan[i], jumlahHuruf[i]);
        }
    }
}
