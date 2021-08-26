package entities;

public class Pair {
	
	private Double value = 0.0;

	public Pair() {
	}

	public Pair(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
