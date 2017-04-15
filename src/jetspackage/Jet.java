package jetspackage;

public class Jet {
	private String model;
	private double speed;
	private int range;
	private double price;
	
	public Jet() {
		this("unknown", 0.0, 0, 0);
	}

	public Jet(String model, double speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed/761.2070;
		this.range = range;
		this.price = price/1_000_000;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(model).append("\t speed: Mach ").append(speed).append("\t range: ").append(range)
				.append(" NM").append("\t price: ").append(price).append(" Million");
		return builder.toString();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
