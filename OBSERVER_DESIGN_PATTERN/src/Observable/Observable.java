package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class Observable implements StockObservable {
	
	List<Observer> observers = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifySubsribers() {
		for(Observer ob: observers) {
			ob.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) {
			notifySubsribers();
		}
		stockCount += newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}
	
}
