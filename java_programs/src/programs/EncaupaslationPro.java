package programs;

public class EncaupaslationPro {

	private int hr,min,sec;

	

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public EncaupaslationPro(int hr, int min, int sec) {
		super();
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "EncaupaslationPro [hr=" + hr + ", min=" + min + ", sec=" + sec + "]";
	}
	
}
