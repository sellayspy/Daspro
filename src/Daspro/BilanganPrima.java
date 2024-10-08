import java.util.ArrayList;
import java.util.List;

public class BilanganPrima {
    public static void main(String[] args) {

        System.out.println("Bilangan prima dari 1 sampai 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu bilangan prima atau tidak
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Bilangan prima dimulai dari 2
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Jika habis dibagi, berarti bukan bilangan prima
            }
        }
        return true; // Jika tidak ada faktor selain 1 dan n, maka bilangan prima
    }
}
