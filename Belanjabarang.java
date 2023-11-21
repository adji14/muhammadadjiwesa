import java.util.Scanner;

public class Belanjabarang {
    public static void main(String[] args) {
        
        int[] hargaBarang = { 2500, 3000, 4000, 5000, 6000 };
        int[] jumlahBarang = new int[5];

        Scanner scanner = new Scanner(System.in);

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan jumlah barang item-" + (i) + "Rp " + hargaBarang[i] + ": ");
            jumlahBarang[i] = scanner.nextInt();
        }

        
        int totalBelanja = 0;

        System.out.println("\nDaftar Belanja dan Harga ");
        for (int i = 0; i < 5; i++) {
            int totalItem = hargaBarang[i] * jumlahBarang[i];
            totalBelanja += totalItem;

            System.out.println("Harga barang ke-" + (i) + ", " +  hargaBarang[i]+ "," +  jumlahBarang[i]+ "item" + " = Rp" + totalItem);
        }
		int item = 0;
		for (int a = 0; a < 5 ; a++){
			item = item + jumlahBarang[a];
		}
		System.out.println("\nTOTAL ITEM BELANJA: " + item);
        System.out.println("\nTOTAL BELANJA: Rp" + totalBelanja);
		

      
        scanner.close();
    }
}
