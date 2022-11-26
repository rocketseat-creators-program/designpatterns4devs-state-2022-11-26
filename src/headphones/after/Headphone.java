package headphones.after;

import headphones.after.states.HeadphoneState;
import headphones.after.states.OffState;

public class Headphone {
    
    private HeadphoneState state;
	private boolean isOn;
	private boolean isPlaying;
	
	public Headphone() {
		this.isOn = false;
		this.isPlaying = false;
		state = OffState.getInstance();
	}
	
	public void onLongClick() {
		System.out.println("Long Click Pressed...");
		state.longClick(this);
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		state.click(this);
	}

	public HeadphoneState getState() {
		return state;
	}

	public void setState(HeadphoneState state) {
		System.out.println(String.format("Changing from %s to %s", 
				this.state.getClass().getSimpleName(), 
				state.getClass().getSimpleName()));
		this.state = state;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

}
