import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		Login login=new Login();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bankam�za ho�geldiniz...");
		System.out.println("*******************************");
		System.out.println("Kullan�c� Giri�i");
		System.out.println("*******************************");
		int giris_hakki=3;
		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giri� ba�ar�l�.");
				break;
			}
			else {
				System.out.println("Giri� ba�ar�s�z!");
				giris_hakki-=1;
				System.out.println("Kalan giri� hakk�:"+giris_hakki);
			}
			if (giris_hakki==0) {
				System.out.println("Giri� hakk�n�z bitti!");
				return;
			}
		}
		System.out.println("*******************************");
		String islemler="1.Bakiye G�r�nt�leme\n"
				              +"2.Para Yat�rma\n"
				              +"3.Para �ekme\n"
				              +"��k�� i�in x'e bas�n..";
		System.out.println(islemler);
		System.out.println("*******************************");
		while (true) {
			System.out.print("��lem se�iniz:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				break;
			}
			else if (islem.equals("1")) {
				System.out.println("Bakiyeniz:"+hesap.getBakiye());
			}
			else if (islem.equals("2")) {
				System.out.print("Yat�rmak istedi�iniz tutar:");
				int tutar=scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
			}
			else if (islem.equals("3")) {
				System.out.println("�ekmek istedi�iniz tutar:");
				int tutar=scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			}
			else {
				System.out.println("Ge�ersiz i�lem!");
			}
		}
		
	}

}
