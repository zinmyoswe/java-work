package java_useful;

public class operator_test {
	public static void main(String args[]) {
		int x = 3;
		int y = 3;
		int z = x+y;
		int a = 6;
		int b = 7;
		int c = 13;
		int d = (x+y)*(a/c);
		
//	    2nd operator
		int e = 7;
		int f = 4;
		x += 4;
		y -= 4;
		a *= 5;
		b /= 3;
		c %= 5;
		e &= 3;
		f ^= 3;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(z);
		System.out.println("-----------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("-----------------");
		System.out.println(e);
		System.out.println(f);
		
	}

}
