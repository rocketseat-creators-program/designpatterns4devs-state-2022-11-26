package headphones.after.states;

import headphones.after.Headphone;

public class OffState implements HeadphoneState {

    private static final HeadphoneState instance = new OffState();
	private OffState() {}

	@Override
	public void click(Headphone hp) {
		//Nothing to do!
	}

	@Override
	public void longClick(Headphone hp) {
		hp.setOn(true);
		System.out.println("> Turning On");
		hp.setState(OnState.getInstance());
	}

	public static HeadphoneState getInstance() {
		return instance;
	}
    
}
