package Daspro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ipk {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Mencari Nilai akhir dari kuis 10%,softSkill 10%,tugas 20%, uts 30%,uas 30%
        double kuis,softSkill,tugas,uts,uas,nilaiAkhir;

        System.out.print("Masukan nilai Quiz      : ");
        kuis = Double.parseDouble(input.readLine());
        System.out.print("Masukan nilai softSkill : ");
        softSkill = Double.parseDouble(input.readLine());
        System.out.print("Masukan tugas           : ");
        tugas = Double.parseDouble(input.readLine());
        System.out.print("Masukan uts             : ");
        uts = Double.parseDouble(input.readLine());
        System.out.print("Masukan uas             : ");
        uas = Double.parseDouble(input.readLine());


        nilaiAkhir = (0.10*kuis) + (0.10*softSkill) + (0.10*tugas) + (0.30*uts) + (0.30*uas);

        System.out.print("Nilai Akhir : " + nilaiAkhir);
    }
}
