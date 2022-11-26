package headphones.after.states;

import headphones.after.Headphone;

public interface HeadphoneState {
    
    void click(Headphone hp);
	void longClick(Headphone hp);

}
