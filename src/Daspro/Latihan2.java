public class Latihan2 {
    public static void main(String[] args) {

        int size = 5;
        int value = 1;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j <= i; j++)
                System.out.print(value++ + " ");
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++)
                System.out.print(i + j + 1 + " ");
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            int value2 = i + 1;
            String s = value2 + " ";

            for (int j = 1; j <= i; j++) {
                value2 += 5 - j;
                s += value2 + " ";
            }

            System.out.println(s);
        }   
    }
}
