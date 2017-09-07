package maxA;

public class MaxSubArray {
	
	private int low;
	private int high;
	private int sum;
	
	public MaxSubArray(int low, int high, int sum) {
		this.low = low;
		this.high = high;
		this.sum = sum;
	}
	
	public String toString(){
		return "Low: " + low + " High: " + high + " Sum: " + sum;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
