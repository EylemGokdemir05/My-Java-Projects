import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Birinci vize:");
		int vize1=scanner.nextInt();
		System.out.print("Ýkinci vize:");
		int vize2=scanner.nextInt();
		System.out.print("Final:");
		int fin=scanner.nextInt();
		double ort;
		ort=(vize1*0.3)+(vize2*0.3)+(fin*0.4);
		System.out.println("Ortalama:"+ort);
		if(ort>=90){
			System.out.println("Harf notu:AA");
		}
		else if(ort>=85){
			System.out.println("Harf notu:BA");
		}
		else if(ort>=80){
			System.out.println("Harf notu:BB");
		}
		else if(ort>=75){
			System.out.println("Harf notu:CB");
		}
		else if(ort>=70){
			System.out.println("Harf notu:CC");
		}
		else if(ort>=65){
			System.out.println("Harf notu:DC");
		}
		else if(ort>=60){
			System.out.println("Harf notu:DD");
		}
		else if(ort>=55){
			System.out.println("Harf notu:FD");
		}
		else{
			System.out.println("Harf notu:FF");
		}

	}

}
