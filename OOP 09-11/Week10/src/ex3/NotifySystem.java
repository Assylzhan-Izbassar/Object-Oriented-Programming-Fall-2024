package ex3;

public class NotifySystem {
	Notifier notifier;
	
	public NotifySystem(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void setNotifier(Notifier newNotifier) {
		this.notifier = newNotifier;
	}
	
	public void sendMessage(String message) {
		notifier.send(message);
	}
}
