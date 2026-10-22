public class DiscoBall {

	private String size; 
	private String color; 
	private String RPM; 
	
	public DiscoBall() {
	size = "12 in";
	color = "silver";
	RPM = "0 rpm";
	}
	public DiscoBall (String initializeSize, String newColor, String newRPM) {
		this ();
		size = initializeSize;
		color = newColor; 
		RPM = newRPM; 
		
	}
	
}
