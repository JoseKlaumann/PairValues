package entities;

public class Count {
	
	private Integer count = 0;
	
	public Count() {
	}
	
	public Count(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void addCount() {
		count++;
	}
	
	public String toString() {
		return getCount() + " pair values";
	}
}
