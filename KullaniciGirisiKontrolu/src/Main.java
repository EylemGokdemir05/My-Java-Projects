import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int giris_hakki=3;
		String sys_kullanici_adi="Eylem";
		String sys_parola="1234567";
		System.out.println("***************************");
		System.out.println("Kullanýcý giriþine hoþgeldiniz.");
		System.out.println("***************************");
		while(true){
			System.out.print("Kullanýcý adý:");
			String ad=scanner.nextLine();
			System.out.print("Parola:");
			String parola=scanner.nextLine();
			if(ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
				System.out.println("Hoþgeldiniz "+ad);
				break;
			}
			else if(ad.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
				System.out.println("Parolanýz yanlýþ");
				giris_hakki-=1;
				System.out.println("Giriþ hakký:"+giris_hakki);
			}
			else if(!ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
				System.out.println("Kullanýcý adýnýz yanlýþ");
				giris_hakki-=1;
				System.out.println("Giriþ hakký:"+giris_hakki);
			}
			else{
				System.out.println("Kullanýcý adýnýz ve parolanýz yanlýþ");
				giris_hakki-=1;
				System.out.println("Giriþ hakký:"+giris_hakki);
			}
			if(giris_hakki==0){
				System.out.println("Giriþ hakkýnýz bitti.");
				break;
			}
		}

	}

}
