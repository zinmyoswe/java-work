package java_useful;

public class operator {
	public static void main(String args[]) {
		int x = 9;
		int y =15;
		int z = 12;
		int a = 8;
		int b = 16;
		int c = 3;
		int e = 5;
		int f = 5;
		int k =36;
		x += 5;
		y /=5;
		z %=5;
		a &=10;
		b |= 10;
		c ^= 8;
		e >>= 6;
		f <<= 6;
		k |= 15;
		
//		logical operator
		int g = 5;
		int h = 7;
		
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println("------------");
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------");
		System.out.println(e);
		System.out.println(f);
		System.out.println("------------");
		System.out.println(g > 3 && g <10);
		System.out.println(h > 3 || h < 4);
		System.out.println(!(g > 3 && g < 10));
		System.out.println(k);
		
	}
}
