import java.util.Scanner;

public class KODENEGARACASE  {
    public static void main(String[] args) {
        Scanner Negara = new Scanner(System.in);

        System.out.print("Program konversi kode negara.masukkan negara (ES,TN,ID,MM,IN : ");
        String kodeNegara = Negara.next();

        String hasil;

        switch (kodeNegara) {
            case "ES":
                hasil = "Spain";
                break;
            case "TN":
                hasil = "Tunisia";
                break;
            case "ID":
                hasil = "Indonesia";
                break;
            case "MM":
                hasil = "Myanmar";
                break;
            case "IN":
                hasil = "India";
                break;
            default:
                System.out.println("maaf,konversi nilai tidak diketahui!!");
                return; 
                // menghentikan program jika input salah
        }

        System.out.println("Konversi negara : " + kodeNegara + " nama negaranya adalah: " + hasil);
    }
}