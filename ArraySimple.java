import java.util.Scanner;

public class ArraySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahData;
        int[] array = new int[6];
        int jumlah, rerata;

        System.out.print("Jumlah Data: ");
        jumlahData = sc.nextInt();
        System.out.println("Inputkan data berikut");

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.println("Menampilkan data");
        for (int j = 0; j < jumlahData; j++) {
            if (array[j] % 2 == 0) {
                System.out.println(" " + array[j] + "->> GENAP");
            } else {
                System.out.println(" " + array[j] + "->> GANJIL");
            }
        }

        jumlah = 0;
        for (int k = 0; k < jumlahData; k++) {
            jumlah = jumlah + array[k];
        }
        rerata = jumlah / jumlahData;
        System.out.println("TOTAL PENJUMLAHAN: " + jumlah);
        System.out.println("RATA-RATA: " + rerata);
    }
}
