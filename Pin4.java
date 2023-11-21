import java.util.Scanner;

	public class Pin  {
		public static void main(String[] args) {
		
			int pin = 1211;
			int maxchance  = 3;
			for(int a = 1; a <= maxchance; a++) {
				Scanner in = new Scanner(System.in);
				System.out.print("Silahkan masukkan pin anda = ");
				int menebak = in.nextInt();
				if(menebak == pin) {
					System.out.println("Selamat pin anda benar!!");
					break;
				} else {	
					System.out.println("Pin yang anda masukkan salah");
					int sisa = maxchance - a;
					System.out.println("Sisa kesempatan anda = " + sisa);
					if(sisa > 0) {
						System.out.print("Silahkan coba lagi ");
					} else {
						System.out.println("Pin salah,silahkan coba 3 jam lagi");
					}
					
				}
			}
		}
	
	}