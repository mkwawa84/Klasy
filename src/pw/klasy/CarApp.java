package pw.klasy;

public class CarApp {

	public static void main(String[] args) {
		NoKeyCar nkc=new NoKeyCar("Audi", "Black");
		ClassicCar cc=new ClassicCar("Kia","Red");
		
		nkc.on();
		nkc.drive();
		nkc.stop();
		nkc.off();
		
		
		System.out.println("\n\n\n\n");
		
		cc.drive();
		cc.on();
		cc.drive();
		cc.stop();
		cc.off();
		
		

	}

}
