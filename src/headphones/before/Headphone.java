package headphones.before;

public class Headphone {

    private boolean isOn;
	private boolean isPlaying;
	
	public Headphone() {
		this.isOn = false;
		this.isPlaying = false;
	}
	
	public void onLongClick() {
		System.out.println("LONG Click Pressed...");
		if(isOn) {
			System.out.println("> Turning Off");
			isOn = false;
		} else {
			System.out.println("> Turning On");
			isOn = true;
		}
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		if(isOn) {
			if(isPlaying) {
				System.out.println("> Stop Player");
				isPlaying = false;
			} else {
				System.out.println("> Resume Player");
				isPlaying = true;
			}
		}
	}
}
