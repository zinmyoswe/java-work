package java_useful;

public class string {
	public static void main(String args[]) {
		String txt ="abcdef";
		System.out.println("The length of the string is "+ txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		String std = "my name is thura aung";
		System.out.println(std.indexOf("is"));
		
		String firstname = "Jhon";
		String lastname = "Doe";
		System.out.println(firstname+" "+lastname);
		System.out.println(firstname.concat(lastname));
		
		String position = "we are live in \"Yangon\" in Myanmar";
		System.out.println(position);
		
		String popo = "It's mine";
		System.out.println(popo);
		
		String susu = "the character \\ is barnyar";
		System.out.println(susu);
		
		String bubu = "Hello \n World";
		System.out.println(bubu);
		
		String brbr = "Hello \t World";
		System.out.println(brbr);
		
		String x = "20";
		int y = 10;
		String z = x+y;
		System.out.println(z);
		
	}
}
