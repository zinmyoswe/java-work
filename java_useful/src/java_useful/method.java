package java_useful;

public class method {
	public static void main(String args[]) {
		try {
			int[] myno = {1,2,3,4};
			
			System.out.println(myno[3]);
		}
		catch(Exception e) {
			System.out.println("WRONG!!!");
		}
		finally{
			System.out.println("Try catch finished");
		}
	}
}
