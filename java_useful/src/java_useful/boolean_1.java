package java_useful;

public class boolean_1 {
	public static void main(String args[]) {
		int x = 10;
		int y = 15;
		System.out.println(x>y);
		
		String today = "Tuesday";
		if(today == "Monday") {
			System.out.println("Happy monday");
		}else if(today == "Sunday") {
			System.out.println("my birthday");
		}else {
			System.out.println("boring");
		}
		
		int time =20;
		String result;
		result = (time < 30) ? "Good day" : "good evening";
		System.out.println(result);
	}
}
