package java_programs;
//Print the denomination for the rupees 1535 (1000Rs 1 Note,500Rs 1 note,20Rs 1 note,10Rs 1 note,5Rs 1 note)
public class Denomination {
	public static void main(String[] args) {
		int n = 8245; 
        int thousand = 1000;
        int fiveHundred = 500;
        int hundred = 100;
        int fifty = 50;
        int twenty = 20;
        int ten = 10;
        int five = 5;
        int one = 1;

        int count1000 = n / thousand;
        n %= thousand;

        int count500 =n / fiveHundred;
        n %= fiveHundred;

        int count100 = n / hundred;
        n %= hundred;

        int count50 = n / fifty;
        n %= fifty;

        int count20 = n / twenty;
        n %= twenty;

        int count10 = n / ten;
        n %= ten;

        int count5 =n / five;
        n%= five;

        int count1 = n / one;
        n %= one;

        if (count1000 > 0) {
            System.out.println("1000 : " + count1000);
        }
        if (count500 > 0) {
            System.out.println("500 : " + count500);
        }
        if (count100 > 0) {
            System.out.println("100 : " + count100);
        }
        if (count50 > 0) {
            System.out.println("50 : " + count50);
        }
        if (count20 > 0) {
            System.out.println("20 : " + count20);
        }
        if (count10 > 0) {
            System.out.println("10 : " + count10);
        }
        if (count5 > 0) {
            System.out.println("5 : " + count5);
        }
        if (count1 > 0) {
            System.out.println("1 : " + count1);
        }
	}
}
