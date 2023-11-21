import java.util.Scanner;

public class Arrayganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahData;
        int[] array = new int[6];
        int jumlah;
		double rerata;

        System.out.print("Jumlah Data: ");
        jumlahData = sc.nextInt();
        System.out.println("Inputkan data berikut");

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.println("Menampilkan data");
        for (int x = 0; x < jumlahData; x++) {
            if (array[x] % 2 == 0) {
                System.out.println(" " + array[x] + "->> GENAP");
            } else {
                System.out.println(" " + array[x] + "->> GANJIL");
            }
        }

        jumlah = 0;
        for (int z = 0; z < jumlahData; z++) {
            jumlah = jumlah + array[z];
        }
        rerata = jumlah / jumlahData;
        System.out.println("TOTAL PENJUMLAHAN: " + jumlah);
        System.out.println("RATA-RATA: " + rerata);
    }
}