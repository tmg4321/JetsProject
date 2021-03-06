package jetspackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Jet {
	private String model, pilot;
	private Double speed;
	private Integer range;
	private Double price;

	public Jet() {
		this("unknown", 0.0, 0, 0.0, "unknown");
	}

	public Jet(String model, Double speed, Integer range, Double price, String pilot) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price / 1_000_000;
		this.pilot = pilot;
	}
	
	public void speedInMach(String model, double x) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		double mak = x / 761.21;
		System.out.println(model +"'s Mach speed is:" + formatter.format(mak));
		
	}
	
	public void whatPilot(String x) {
		System.out.println("jet4's pilot is: " + x);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(model).append("\t   speed:").append(speed).append(" MPH").append("   range: ")
				.append(range).append(" NM").append("   price: ").append(price).append(" Million").append(" \tpilot: ")
				.append(pilot);
		return builder.toString();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String x) {
		this.pilot = x;
	
	}

}
