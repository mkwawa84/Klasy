package pw.klasy;

public abstract class Auto {
	protected boolean running = false;
	protected boolean driving = false;
	private int gearNo = 0;
	private String model;
	private String color;

	public Auto(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public boolean isRunnning() {
		return running;
	}

	protected abstract void setRunning(boolean running);

	protected abstract void setDriving(boolean driving);

	public boolean isDriving() {
		return driving;
	}

	public int getGearNo() {
		return gearNo;
	}

	public void setGearNo(int gearNo) {
		this.gearNo = gearNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}