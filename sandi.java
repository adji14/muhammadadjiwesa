import java.util.Scanner;


public class sandi {
    public static void main(String[] args) {
        String sandi = "1406";
        int maksimalminimal = 3;
        int minimal = 0;

        Scanner scanner = new Scanner(System.in);
        while (minimal < maksimalminimal) {
            System.out.print("Masukkan SANDI 4 digit: ");
            String inputSandi = scanner.nextLine();

            if (inputSandi.equals(sandi)) {
                System.out.println("SANDI yang Anda masukkan benar. Akses diberikan.");
                
            } else {
                minimal++;
                System.out.println("SANDI yang Anda masukkan salah. Sisa percobaan: " + (maksimalminimal-minimal));
            }
        }

        if (minimal >= maksimalminimal) {
            System.out.println("Anda telah melebihi batas maksimal percobaan. Akses ditolak.");
        }   
    }
}