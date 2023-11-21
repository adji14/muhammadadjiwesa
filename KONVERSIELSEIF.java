import java.util.Scanner;

public class KONVERSIELSEIF {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.print("Program Konversi Nilai Huruf. masukkan huruf (A, B, C, D, atau E): ");
        String nilaiAdji = angka.next();

        double hasil;

        if (nilaiAdji.equals("A")) {
            hasil = 4.0;
        } else if (nilaiAdji.equals("B")) {
            hasil = 3.0;
        } else if (nilaiAdji.equals("C")) {
            hasil = 2.0;
        } else if (nilaiAdji.equals("D")) {
            hasil = 1.0;
        } else if (nilaiAdji.equals("E")) {
            hasil = 0.0;
        } else {
            System.out.println("maaf,konversi nilai tidak diketahui!!");
            return; 
            // menghentikan program jika input salah
        }

        System.out.println("konversi huruf : " + nilaiAdji + " hasilnya adalah " + hasil);
    }
}