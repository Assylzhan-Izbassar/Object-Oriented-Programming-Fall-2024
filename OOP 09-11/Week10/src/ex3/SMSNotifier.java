package ex3;

public class SMSNotifier implements Notifier {

	@Override
	public void send(String message) {
		System.out.println("SMS " + message);
	}

}
