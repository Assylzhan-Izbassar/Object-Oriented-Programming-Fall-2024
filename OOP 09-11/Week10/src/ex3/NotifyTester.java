package ex3;

public class NotifyTester {

	public static void main(String[] args) {
		
		SMSNotifier notifier = new SMSNotifier();
		NotifySystem ns = new NotifySystem(notifier);
		
		ns.sendMessage("Hello, Java!");
		
		EmailNotifier eNotifier = new EmailNotifier();
		ns.setNotifier(eNotifier);
		
		ns.sendMessage("Hello, Outlook!");
	}

}
