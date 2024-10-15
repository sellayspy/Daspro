package Daspro;
import java.util.Scanner;

public class ToDoList {
    static final int maxTugas = 5;
    static String[] listTugas = new String[maxTugas];
    static int jumlahTugas = 0;

    private static void tambahTugas (String tugasBaru) {
        listTugas[jumlahTugas] = tugasBaru;
        jumlahTugas++;
    }

    private static void tampilkanTugas(){
        if (jumlahTugas > 0){
            for (int i = 0; i < jumlahTugas; i++){
                System.out.println(i + 1 + " " + listTugas[i]);
            }
        } else {
            System.out.println("List belum ada");
        }
    }

    private static void hapusTugas(int noTugas){
        if (noTugas >= 1 && noTugas <= jumlahTugas){
            for (int i = noTugas-1; i < jumlahTugas-1;i++){
                listTugas[i] = listTugas[i + 1];
            }
            jumlahTugas--;
        } else {
            System.out.println("No tugas tidak ada");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n-------List Tugas--------");
            System.out.println("1. Tambahkan Tugas");
            System.out.println("2. Tampilkan Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");

            System.out.print("Pilih Antara no 1-4 : ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.println("====Tambahkan Tugas====");
                    if (jumlahTugas < maxTugas){
                        System.out.print("Masukan Tugas : ");
                        String tugasBaru = input.nextLine();
                        tambahTugas(tugasBaru);
                        System.out.println("Tugas berhasil di tambahkan");
                    } else {
                        System.out.println("Maaf list sudah penuh");
                    }
                    break;
                case 2:
                    System.out.println("====Tampilkan Tugas====");
                    tampilkanTugas();
                    break;
                case 3:
                    System.out.println("====Hapus Tugas====");
                    if (jumlahTugas > 0){
                        tampilkanTugas();
                        System.out.print("Pilih nomer yang ingin dihapus : ");
                        int noDihapus = Integer.parseInt(input.nextLine());
                        hapusTugas(noDihapus);
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih Telah Mengunjungi Aplikasi");
                    break;
                default:
                    System.err.println("Anda hanya dapat memilih nomer antara 1-4,selain itu error");
            }
        } while (pilihan != 4);
    }
}
