package java_useful;

public class method2 {
	
	static void Checkage(int age) {
		if(age < 18) {
			System.out.println("Access denied - You must be at least 18 years old.");
		}else {
			System.out.println("access granted!!!");
		}
	}
	public static void main(String args[]) {
		Checkage(10);
	}
}
