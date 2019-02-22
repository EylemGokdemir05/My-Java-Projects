import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//bakiye sorgulama
		//para �ekme
		//para yat�rma
		//q ile ��k��
		Scanner scanner=new Scanner(System.in);
		int bakiye=700;
		String islemler="1.i�lem:Bakiye Sorgulama\n"+
				        "2.i�lem:Para �ekme\n"+
				        "3.i�lem:Para Yat�rma\n"+
				        "��k��:q";
		System.out.println("*****************************");
		System.out.println(islemler);
		System.out.println("*****************************");
		while(true){
			System.out.print("��lemi se�in:");
			String islem=scanner.nextLine();
			if(islem.equals("1")){
				System.out.println("Bakiye:"+bakiye);
			}
			else if(islem.equals("2")){
				System.out.print("�ekilecek tutar:");
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
				System.out.print("Yat�r�lacak tutar:");
				int para=scanner.nextInt();
				scanner.nextLine();
				bakiye+=para;
				System.out.println("Bakiye:"+bakiye);
			}
			else if(islem.equals("q")){
				System.out.println("��k�� yap�l�yor...");
			}
			else{
				System.out.println("Hatal� i�lem yapt�n�z.");
			}
		}

	}

}
