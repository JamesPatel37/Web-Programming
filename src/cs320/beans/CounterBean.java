package cs320.beans;

public class CounterBean {
	private int count;

	public CounterBean() {
		count = 0;
	}

	public int getCount() {
		return ++count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
