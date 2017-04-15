package jetspackage;

public class Pilot {
	private String name;
	
	public Pilot(){}
	
	public Pilot(String name) {
		super();
		this.name = name;
	}

	public String getARandomPilot(Pilot[] pilots) {
		int random = (1 + (int) (Math.random() *(pilots.length -1)));
		return pilots[random].getName();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
