package travelGo;

public class Destination {
	private String name;
	private Enum distance;
	private Enum landscape;
	private Enum price;
	private Enum temperature;
	public Destination(String name, Enum distance, Enum landscape, Enum price, Enum temperature) {
		super();
		this.name = name;
		this.distance = distance;
		this.landscape = landscape;
		this.price = price;
		this.temperature = temperature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum getDistance() {
		return distance;
	}
	public void setDistance(Enum distance) {
		this.distance = distance;
	}
	public Enum getLandscape() {
		return landscape;
	}
	public void setLandscape(Enum landscape) {
		this.landscape = landscape;
	}
	public Enum getPrice() {
		return price;
	}
	public void setPrice(Enum price) {
		this.price = price;
	}
	public Enum getTemperature() {
		return temperature;
	}
	public void setTemperature(Enum temperature) {
		this.temperature = temperature;
	}
	
	

}
