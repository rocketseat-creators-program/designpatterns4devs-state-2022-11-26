package headphones.after.states;

import headphones.after.Headphone;

public class PlayingState implements HeadphoneState {

    private static final HeadphoneState instance = new PlayingState();
	private PlayingState() {}

	@Override
	public void click(Headphone hp) {
		hp.setPlaying(false);
		System.out.println("> Stop Player");
		hp.setState(OnState.getInstance());
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
