import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//bakiye sorgulama
		//para çekme
		//para yatýrma
		//q ile çýkýþ
		Scanner scanner=new Scanner(System.in);
		int bakiye=700;
		String islemler="1.iþlem:Bakiye Sorgulama\n"+
				        "2.iþlem:Para Çekme\n"+
				        "3.iþlem:Para Yatýrma\n"+
				        "Çýkýþ:q";
		System.out.println("*****************************");
		System.out.println(islemler);
		System.out.println("*****************************");
		while(true){
			System.out.print("Ýþlemi seçin:");
			String islem=scanner.nextLine();
			if(islem.equals("1")){
				System.out.println("Bakiye:"+bakiye);
			}
			else if(islem.equals("2")){
				System.out.print("Çekilecek tutar:");
				int para=scanner.nextInt();
				scanner.nextLine();
				if(bakiye-para<0){
					System.out.println("Yetersiz bakiye");
				}
				else{
					bakiye-=para;
					System.out.println("Bakiye:"+bakiye);
				}
				
			}
			else if(islem.equals("3")){
				System.out.print("Yatýrýlacak tutar:");
				int para=scanner.nextInt();
				scanner.nextLine();
				bakiye+=para;
				System.out.println("Bakiye:"+bakiye);
			}
			else if(islem.equals("q")){
				System.out.println("Çýkýþ yapýlýyor...");
			}
			else{
				System.out.println("Hatalý iþlem yaptýnýz.");
			}
		}

	}

}
