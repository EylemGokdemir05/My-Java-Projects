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
				        +"2.��karma\n"
				        +"3.�arpma\n"
				        +"4.B�lme\n"
				        +"��k�� i�in x'e bas�n.";
		System.out.println("*****************************");
		System.out.println(islemler);
		System.out.println("*****************************");
		while(true) {
			System.out.print("��lem se�in:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("��k�� yap���yor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Ka� say� toplamak istiyorsunuz:");
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
					System.out.println("Bunun i�in uygun metot yok!");
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
				System.out.print("Ka� say� �arpmak istiyorsunuz:");
				int sayi=scanner.nextInt();
				if(sayi==2) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					scanner.nextLine();
					System.out.println("�arp�m:"+carpma(a,b));
				}
				else if(sayi==3) {
					System.out.print("a:");
					int a=scanner.nextInt();
					System.out.print("b:");
					int b=scanner.nextInt();
					System.out.print("c:");
					int c=scanner.nextInt();
					scanner.nextLine();
					System.out.println("�arp�m:"+carpma(a,b,c));
				}
				else {
					System.out.println("Bunun i�in uygun metot yok!");
				}
			}
			else if(islem.equals("4")) {
				System.out.print("a:");
				int a=scanner.nextInt();
				System.out.print("b:");
				int b=scanner.nextInt();
				scanner.nextLine();
				System.out.println("B�l�m:"+bolme(a,b));
			}
			else {
				System.out.println("Ge�ersiz i�lem!");
			}
		}
	}
}
