import java.util.Scanner;

public class MenampilkanHari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka Hari dari (1 sd 7) ? : ");
        int angkaHari = input.nextInt();

        String hari;
        switch (angkaHari){
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jum'at";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari ="Minggu";
                break;

            default:
                hari ="Tidak ada hari dengan angka tersebut";
        }
        if (angkaHari >= 1 && angkaHari <= 7) {
            System.out.println("Hari ke " + angkaHari + " Merupakan hari " + hari);
        } else {
            System.out.println(hari);
        }

        input.close();
    }
}
