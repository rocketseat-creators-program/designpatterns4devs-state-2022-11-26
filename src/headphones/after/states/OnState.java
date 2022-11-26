package headphones.after.states;

import headphones.after.Headphone;

public class OnState implements HeadphoneState {

    private static final HeadphoneState instance = new OnState();
	private OnState() {}

	@Override
	public void click(Headphone hp) {
		hp.setPlaying(true);
		System.out.println("> Resume Player");
		hp.setState(PlayingState.getInstance());
	}

	@Override
	public void longClick(Headphone hp) {
		hp.setOn(false);
		System.out.println("> Turning Off");
		hp.setState(OffState.getInstance());
	}

	public static HeadphoneState getInstance() {
		return instance;
	}
    
}
