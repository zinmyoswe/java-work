package java_useful;

public class array {
	public static void main(String args[]) {
		String[] cars = {"toyota","honda","suzuki"};
		String[] name = {"mgmg","hlahla","myamya"};
		cars[0] = "BMW";
		int [] myno = {1,2,3,4,5,6};
		System.out.println(cars[0]);
		System.out.println(cars.length);
		System.out.println(myno[1]);
		
		for(int i =0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		for(String x : name) {
			System.out.println(x);
		}
		
		int[][] attribute = {{1,2,3,4},{5,6,7}};
		int z = attribute[1][2];
		System.out.println(z);
		
	}
}
