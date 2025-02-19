package Daspro2;

import java.util.Scanner;

public class LatihanProgram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama,npm;
        int jumlahMatkul;

        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NPM : ");
        npm = input.nextLine();

        System.out.print("Masukan Jumlah Mata kuliah : ");
        jumlahMatkul = input.nextInt();
        input.nextLine();

        String[] matkul = new String[jumlahMatkul];
        int[] sks       = new int[jumlahMatkul];
        int[] nilai     = new int[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukan mata kuliah ke - " + (i + 1));
            System.out.print("Masukan mata kuliah : ");
            matkul[i] = input.nextLine();
            System.out.print("Sks : ");
            sks[i] = input.nextInt();
            System.out.print("Nilai dari (1-100) : ");
            nilai[i] = input.nextInt();
            input.nextLine();
        }
            System.out.println("\nNama : " + nama);
            System.out.println("NPM : " + npm);
            System.out.println("\nMata Kuliah\t\tSKS\tNilai\tIndeks");

            int totalSks = 0;
            double totalNilai = 0;

            for(int i = 0;i < jumlahMatkul; i++)
            {
                String indeks = hitungIndeks(nilai[i]);
                double nilaiIndeks = hitungNilaiIndeks(indeks);

                System.out.println(matkul[i] + "\t\t" + sks[i] + "\t" + nilai[i] + "\t" + indeks);

                totalSks += sks[i];
                totalNilai += nilaiIndeks * sks[i];
            }

            double ip = totalNilai / totalSks;
            System.out.printf("\nIndeks Presentasi (IP) : %.2f\n", ip);

            input.close();
        }

        public static String hitungIndeks(int nilai) {
            if (nilai >= 86) {
                return "A";
            } else if (nilai >= 71) {
                return "B";
            } else if (nilai >= 61) {
                return "C";
            } else if (nilai >= 40) {
                return "D";
            } else {
                return "E";
            }
    }
        public static double hitungNilaiIndeks(String indeks) {
            switch (indeks) {
                case "A":
                    return 4.0;
                case "B":
                    return 3.0;
                case "C":
                    return 2.0;
                case "D":
                    return 1.0;
                case "E":
                    return 0.0;
                default:
                    return 0.0;
            }
    }
}
