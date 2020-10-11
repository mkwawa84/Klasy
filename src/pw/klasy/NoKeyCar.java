package pw.klasy;

public class NoKeyCar extends Auto implements Obsluga {

	public NoKeyCar(String model, String color) {
		super(model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		System.out.println("Push the button!");
		this.setRunning(true);
		System.out.println("Engine is running!");
	}

	@Override
	public void off() {

		System.out.println("Push the button!");
		this.setRunning(false);
		System.out.println("Engine is stopped!");

	}

	@Override
	public void drive() {
		if (this.isRunnning()) {
			System.out.println("Put in gear!");
			this.changeGear();
			System.out.println("Press the gas pedal!");
			this.setDriving(true);
		} else {
			System.out.println("Start engine first!");
		}

	}

	@Override
	public void changeGear() {

		this.setGearNo(getGearNo() + 1);
		System.out.println("We have " + this.getGearNo() + " gear in!");
	}

	@Override
	public void setRunning(boolean running) {
		// TODO Auto-generated method stub
		this.running = running;

	}

	@Override
	public void setDriving(boolean driving) {
		// TODO Auto-generated method stub
		this.driving = driving;
		System.out.println("Yeah! Im driving!");

	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Hit the brake!");
		this.setGearNo(getGearNo() - 1);
		System.out.println("We have neutral gear in!");

	}

}
