package Observer;

import Observable.StockObservable;

public class EmailAlert implements Observer {
	String emailId;
	StockObservable observable;
	public EmailAlert(String emailId, StockObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		sendEmail(emailId, "Product is in Stock, Hurry up!");
	}
	
	public void sendEmail(String emailId, String message) {
		System.out.println("Mail sent to: "+emailId+", Message: "+message);
	}
}
