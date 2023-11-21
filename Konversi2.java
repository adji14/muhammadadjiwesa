import java.util.Scanner;

public class KONVERSI_NILAI_INDEX {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.print("Program Konversi Nilai Huruf. masukkan huruf (A, B, C, D, atau E) : ");
        String nilaiAdjiwesa = angka.next();

        double hasil;

        switch (nilaiAdjiwesa) {
            case "A":
                hasil = 4.0;
                break;
            case "B":
                hasil = 3.0;
                break;
            case "C":
                hasil = 2.0;
                break;
            case "D":
                hasil = 1.0;
                break;
            case "E":
                hasil = 0.0;
                break;
            default:
                System.out.println("maaf,konversi nilai tidak diketahui!!");
                return; 
                // menghentikan program jika input salah
        }

        System.out.println("Konversi huruf : " + nilaiAdjiwesa + " hasilnya adalah: " + hasil);
    }
}