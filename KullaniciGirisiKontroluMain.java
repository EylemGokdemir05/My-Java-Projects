import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int giris_hakki=3;
		String sys_kullanici_adi="Eylem";
		String sys_parola="1234567";
		System.out.println("***************************");
		System.out.println("Kullan�c� giri�ine ho�geldiniz.");
		System.out.println("***************************");
		while(true){
			System.out.print("Kullan�c� ad�:");
			String ad=scanner.nextLine();
			System.out.print("Parola:");
			String parola=scanner.nextLine();
			if(ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
				System.out.println("Ho�geldiniz "+ad);
				break;
			}
			else if(ad.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
				System.out.println("Parolan�z yanl��");
				giris_hakki-=1;
				System.out.println("Giri� hakk�:"+giris_hakki);
			}
			else if(!ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
				System.out.println("Kullan�c� ad�n�z yanl��");
				giris_hakki-=1;
				System.out.println("Giri� hakk�:"+giris_hakki);
			}
			else{
				System.out.println("Kullan�c� ad�n�z ve parolan�z yanl��");
				giris_hakki-=1;
				System.out.println("Giri� hakk�:"+giris_hakki);
			}
			if(giris_hakki==0){
				System.out.println("Giri� hakk�n�z bitti.");
				break;
			}
		}

	}

}
