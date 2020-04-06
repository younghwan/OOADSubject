package sandwich;

public abstract class Sandwich {
	String description = "Unknown";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
