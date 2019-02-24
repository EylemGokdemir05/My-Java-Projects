
public class Main {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Hesap hesap=new Hesap("Eylem", "1234567", 3000);
		atm.calis(hesap);
		System.out.println("Programdan çýkýlýyor...");

	}

}
