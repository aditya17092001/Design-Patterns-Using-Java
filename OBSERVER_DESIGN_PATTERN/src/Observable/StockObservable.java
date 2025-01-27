package Observable;

import Observer.Observer;

public interface StockObservable {
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifySubsribers();
	public void setStockCount(int newStockAdded);
	public int getStockCount();
}
