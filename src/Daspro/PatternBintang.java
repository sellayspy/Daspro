import java.util.Scanner;

public class PatternBintang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Masukan Jumlah : ");
        n = input.nextInt();

        System.out.println("====Pola 1 ======");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println();
        }

        System.out.println("====Pola 2 ======");
        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("====Pola 3 ======");
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j < i; j++)
                System.out.print(" ");

            for (int k = n; k >= i; k--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("====Pola 4 ======");
        for (int i = 1; i <= n; i++)
        {
            for(int j = n; j > i; j--)
                System.out.print(" ");

            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("====Pola 5 ======");
        for(int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
                System.out.print(" ");

            for (int k = 1; k <= (2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("==== Pola 6 ======");
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j < i; j++)
                System.out.print(" ");

            for (int k = n; k >= (2*i-n); k--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("==== Pola 7 ======");
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
                System.out.print(" ");

            for (int k = 1; k <= (2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= n; i++)
        {
            for(int j = 1; j < i; j++)
                System.out.print(" ");

            for (int k = n; k >= (2*i-n); k--)
                System.out.print("*");
            System.out.println();
        }

        //Inisialisasi
        int i = 0;
        //Kondisi
        while (i < 5){
            //Aksi
            System.out.println("Hello World");

            i++;
        }

    }
}
