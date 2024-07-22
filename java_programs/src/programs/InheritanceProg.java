package programs;

public class InheritanceProg {

	public static void main(String[] args) {
		InheritanceProg in=new InheritanceProg();
		Flower f=in.garden("hotus");
		f.colour();
		
	}
	public Flower garden(String str) {
		if(str.equals("Rose")) {
			Flower obj=new Rose();
			return obj;
		}
		else if(str.equals("Lotus")) {
			Flower obj=new Lotus();
			return obj;
		}
		else if (str.equals("Sunflower")) {
			Flower obj=new Sunflower();
			return obj;
		}
		else {
			Flower obj=(Flower) new NoFlower();
			return obj;
		}
	}
}
