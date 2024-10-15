package Daspro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasDaspro {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String namaPembeli = null;
        String kodeUkuran  = null;
        String merkBarang  = null;
        String jenisUkuran = null;
        int kodeSusu    = 0;
        int jumlahBeli  = 0;
        int hargaBarang = 0;
        int subtotal    = 0;
        double total       = 0;
        double diskon      = 5;
        double totalDiskon = 0;
        double pajak       = 10;
        double totalPajak  = 0;


        //Input

        //Masukan Nama Pembeli
        System.out.print("Masukan Nama Anda : ");
        namaPembeli = input.readLine();
        //Masukan Kode Susu[1/2/3]
        System.out.print("Masukan Kode susu : ");
        kodeSusu = Integer.parseInt(input.readLine());
        //Masuka Kode ukuran[s/m/l]
        System.out.print("Masukan Kode Ukuran : ");
        kodeUkuran = input.readLine().toUpperCase();
        //masukan jumlah
        System.out.print("Masukan Jumlah : ");
        jumlahBeli = Integer.parseInt(input.readLine());

        //Kondisi
        if ((kodeSusu == 1 || kodeSusu == 2 || kodeSusu == 3)
                && (kodeUkuran.equals("S")|| kodeUkuran.equals("M") || kodeUkuran.equals("L"))) {
            if (kodeSusu == 1){
                merkBarang = "Susu Indomilk";
                if (kodeUkuran.equals("S")){
                    jenisUkuran = "Small";
                    hargaBarang = 5000;
                }
            } else if (kodeSusu == 2) {
                merkBarang = "Susu Dancow";
                if (kodeUkuran.equals("S")){
                    jenisUkuran = "Small";
                    hargaBarang = 4500;
                }
            } else if (kodeSusu == 3) {
                merkBarang = "Susu Sustagen";
                if (kodeUkuran.equals("S")){
                    jenisUkuran = "Small";
                    hargaBarang = 9500;
                }
            }

        //Kondisi
        //LogikaAritmatika
        subtotal = jumlahBeli * hargaBarang;

        if (jumlahBeli > 25) {
            totalDiskon = subtotal * (diskon / 100);
        }

        totalPajak = subtotal * (pajak / 100);

        total = subtotal + totalPajak - totalDiskon;
        //LogikaAritmatikaRiki


        //Output
        System.out.println();
        System.out.println("||================================================||");
        System.out.println("||              STRUK PENJUALAN SUSU              ||");
        System.out.println("||================================================||");
        System.out.println("   Nama Pembeli      \t: \t " + namaPembeli);
        System.out.println("   Merk Barang       \t: \t " + merkBarang);
        System.out.println("   Jenis Ukuran      \t: \t " + jenisUkuran);
        System.out.println("   Jumlah Beli       \t: \t " + jumlahBeli);
        System.out.println("   Harga Barang      \t: \t Rp." + hargaBarang);
        System.out.println("   Jumlah Pembayaran \t: \t Rp." + subtotal);
        System.out.println("   Potongan          \t: \t Rp." + totalDiskon);
        System.out.println("   Pajak             \t: \t Rp." + totalPajak);
        System.out.println("   Total Bayar       \t: \t Rp." + total);

        } else {
            System.out.println("Terjadi Kesalahan Coba Periksa Inputan");
        }
    }
}
