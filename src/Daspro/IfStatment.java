public class IfStatment {
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 90;

        var lulusNilai = nilai >= 70;
        var lulusAbsen = nilai >= 90;

        var lulus = lulusNilai && lulusAbsen;

        if (nilai >= 75 && absen >= 90)
        {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Silahkan Coba lagi taun depan");
        }

        if (nilai >= 80 && absen >= 90)
            {
                System.out.println("Nilai anda A");
            } else if (nilai >= 75 && absen >= 80) {
                System.out.println("Nilai anda B");
        }


    }
}
