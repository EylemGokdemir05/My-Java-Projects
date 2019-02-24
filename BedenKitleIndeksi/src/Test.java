import java.util.Scanner;


public class Test {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kilo:");
		int kilo=scanner.nextInt();
		System.out.print("Boy (Örnek:1,60):");
		double boy=scanner.nextDouble();
		double bki;
		bki=kilo/(boy*boy);
		System.out.println("Beden kitle indeksi:"+bki);
	}

}
