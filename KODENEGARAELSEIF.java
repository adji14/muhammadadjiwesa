import java.util.Scanner;


public class KODENEGARAELSEIF {
    public static void main(String[] args) {
        Scanner negara = new Scanner(System.in);
        System.out.print("Program konversi kode negara.masukkan negara (ES,TN,ID,MM,IN): ");
        String kodeNegara = negara.next();

        String hasil;

        if (kodeNegara.equals("ES")) {
            hasil = "Spanyol";
        } else if (kodeNegara.equals("TN")) {
            hasil = "Tunisia";
        } else if (kodeNegara.equals("ID")) {
            hasil = "Indonesia";
        } else if (kodeNegara.equals("MM")) {
            hasil = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            hasil = "India";
        } else {
            System.out.println("maaf,konversi nilai tidak diketahui!!");
            return; 
            // menghentikan program jika input salah
        }

        System.out.println("konversi Negara : " + kodeNegara + " nama negaranya adalah " + hasil);
    }
}