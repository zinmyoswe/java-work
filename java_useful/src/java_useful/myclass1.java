package java_useful;

public class myclass1 {
	static void staticmethod() {
		System.out.println("static void");
	}
	
	public void pubmethod() {
		System.out.println("public void");
	}
	
	public static void main(String args[]) {
		staticmethod();
		
		
	    myclass1 myobj = new myclass1();
	    myobj.pubmethod();
	    
	}
}
