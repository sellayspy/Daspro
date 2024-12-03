package Daspro;

import java.util.Scanner;

public class Soal2Matematika {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        boolean prima;

        System.out.println("1. Bilangan Prima  \t\t\t 6. FBB\n2. Bilangan Fibonacci  \t\t 7. KPK\n3. Factorial  \t\t\t\t 8. Persamaan Kuadrat\n4. Matriks  \t\t\t\t 9. Nilai Amstrong\n5. FBB");
        System.out.print("Masukan Pilihan Perhitungan Matematika : ");
        int pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1:
                // Bilangan Prima
                int nilai;
                System.out.print("Masukan Angka : ");
                nilai = Integer.parseInt(input.nextLine());

                for (int angka = 2; angka <= nilai; angka++) {
                    prima = true;

                    for (int i = 2; i <= angka / 2; i++) {
                        if (angka % i == 0) {
                            prima = false;
                            break;
                        }
                    }
                    if (prima) {
                        System.out.print(angka + " ");
                    }
                }
                break;
            case 2:
                // Fibonacci
                break;
            default:
                System.out.println("Tidak ada Pilihan yang anda pilih");



        }
    }
}
