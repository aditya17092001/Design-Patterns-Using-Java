import Observable.Observable;
import Observable.StockObservable;
import Observer.EmailAlert;
import Observer.Observer;

public class Main {
	public static void main(String args[]) {
		StockObservable emailObservable = new Observable();
		
		Observer o1 = new EmailAlert("abc@gmail.com", emailObservable);
		Observer o2 = new EmailAlert("def@gmail.com", emailObservable);
		Observer o3 = new EmailAlert("ghi@gmail.com", emailObservable);
		
		emailObservable.add(o1);
		emailObservable.add(o2);
		emailObservable.add(o3);
		
		emailObservable.setStockCount(10);;
		
		
	}
}
