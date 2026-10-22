
public class Dj_Booth {
	
	private String name;
	private String song; 
	private int volume; 
	
	public Dj_Booth() {
	name = "TBD";
	song = "(silence)";
	volume = 5;
	}
	public Dj_Booth(String initializeName, String newSong, int newVolume) {
		this ();
		name = initializeName;
		song = newSong; 
		volume = newVolume; 
		
	}
	public String getSong () {
		return song; 
	}
	public int getVolume () { 
		return volume; 
	}
	public void setVolume(int newVolume2) {
		if (newVolume2 > 10) {
			volume = 10; 
		}
		else if (newVolume2 <= 10 && newVolume2 >= 0 ) {
			volume = newVolume2; 
		}
		
	}
	
}
