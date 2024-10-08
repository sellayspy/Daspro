public class SwicthStatment {
    public static void main(String[] args) {

        var nilai = "E";

        String ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan baik";
                case "B", "C":
                yield  "Anda Lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield  "Mungkin anda salah server";
        };

        System.out.println(ucapan);
    }
}
