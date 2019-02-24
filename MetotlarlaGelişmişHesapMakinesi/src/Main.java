import java.util.Scanner;

public class Main {
	public static int toplama(int a,int b) {
		return a+b;
	}
	public static int cikarma(int a,int b) {
		return a-b;
	}
	public static int carpma(int a,int b) {
		return a*b;
	}
	public static double bolme(int a,int b) {
		return ((double)a/b);
	}
	public static int carpma(int a,int b,int c) {
		return a*b*c;
	}
	public static int toplama(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String islemler="1.Toplama\n"
				        +"2.Çýkarma\n"
				        +"3.Çarpma\n"
				        +"4.Bölme\n"
				        +"Çýkýþ için x'e basýn.";
		System.out.println("*****************************");
		System.out.println(islemler);
		System.out.println("*****************************");
		while(true) {
			System.out.print("Ýþlem seçin:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("Çýkýþ yapýþýyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Kaç sayý toplamak istiyorsunuz:");
				int sayi=scanner.nextInt();
				if(sayi==2) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Toplam:"+toplama(a,b));
				}
				else if(sayi==3) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					System.out.print("c:");
					int c=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Toplam:"+toplama(a,b,c));
				}
				else {
					System.out.println("Bunun için uygun metot yok!");
				}
			}
			else if(islem.equals("2")) {
				System.out.print("a:");
				int a=scanner.nextInt();
				System.out.print("b:");
				int b=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Fark:"+cikarma(a,b));
			}
			else if(islem.equals("3")) {
				System.out.print("Kaç sayý çarpmak istiyorsunuz:");
				int sayi=scanner.nextInt();
				if(sayi==2) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Çarpým:"+carpma(a,b));
				}
				else if(sayi==3) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					System.out.print("c:");
					int c=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Çarpým:"+carpma(a,b,c));
				}
				else {
					System.out.println("Bunun için uygun metot yok!");
				}
			}
			else if(islem.equals("4")) {
				System.out.print("a:");
				int a=scanner.nextInt();
				System.out.print("b:");
				int b=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Bölüm:"+bolme(a,b));
			}
			else {
				System.out.println("Geçersiz iþlem!");
			}
		}
	}
}
