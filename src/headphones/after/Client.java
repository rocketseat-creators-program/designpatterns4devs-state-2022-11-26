package headphones.after;

public class Client {
    
    public static void main(String[] args) {
		Headphone phone = new Headphone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}

}
