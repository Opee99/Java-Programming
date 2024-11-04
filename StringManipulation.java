package collectionpractise;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		//String
		String str1 = new String("Computer Science");
		String str2 = "Engineering";
		char str3[] = { 'a', 'n', 'd' };

		String str4 = str1;
		String str5 = "computer science";
		String str6 = "";
		System.out.println(str1.length());
		System.out.println(str3.length);
		System.out.println(str4);
		if (str1 == str4) {
			System.out.println("str1==str4");
		} else {
			System.out.println("str1!=str4");
		}

		if (str1.equals(str5)) {
			System.out.println("str1==str5");
		} else {
			System.out.println("str1!=str5");
		}
		if (str1.equalsIgnoreCase(str5)) {
			System.out.println("str1==str5");
		} else {
			System.out.println("str1!=str5");
		}
		System.out.println(str6.isEmpty());
		System.out.println(str1.contains("Science"));
		str6 = str1 + " and " + str2;
		System.out.println(str6);
		System.out.println(str1.concat(str2));
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.startsWith("C"));
		System.out.println(str1.endsWith("Science"));
		System.out.println(str1.charAt(2));
		System.out.println(str1.codePointAt(2));
		System.out.println(str1.indexOf('c'));
		System.out.println(str1.lastIndexOf("c"));
		String str7 = " ECE ";
		System.out.println(str7.trim());
		String str8[] = str1.split(" ");
		System.out.println("Length " + str8.length);

		for (String x : str8) {
			System.out.println(x);

		}
		System.out.println(str4.substring(10));
		String str9 = str4.replace("Computer", "Chemical");
		System.out.println(str4);
		System.out.println(str9);
		
		
		
		
		//StringBuffer
		StringBuffer sb=new StringBuffer("Happy Birthday to you");
		sb.append(", Bithi");
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb.length());
		String sb1=sb.toString();
		System.out.println(sb1);
		String string1="madam";
		StringBuffer sb2=new StringBuffer(string1);
		String string2=sb2.reverse().toString();
		if(string2.equals(string1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	    
		
		
		
		//StringBuilder
		StringBuilder stringbuilder=new StringBuilder("Hello Java");
		System.out.println(stringbuilder);
		
		
		//String -> Primitive type
		String s="565";
		int n=Integer.parseInt(s);
		System.out.printf("Int: %d \n",n+6);
		double d= Double.parseDouble(s);
		System.out.printf("Double: %.3f \n",d);
		boolean b=Boolean.parseBoolean(s);
		System.out.printf("Boolean: %b \n",b);
		
		
		//Primitive to String
		String t1=Integer.toString(n);
		System.out.println(t1+" Length: "+t1.length());
		String t2=Double.toString(d);
		System.out.println(t2+"  Length:"+t2.length());
		String t3=Boolean.toString(b);
		System.out.println(t3+" Length: "+t3.length());
	
		
		//autoboxing
		double d1=5.678;
		Double d2= new Double(d1);//primitive to object
		System.out.println(d2);
		d2=d1;
		
		int n1=356;
		Integer integer= n1;
		System.out.println(integer);
		
		
		//unboxing 
		double d3 =d2; //Object to primitive
		System.out.println(d3);
		int n2=integer;
		System.out.println(n2);
		
		
		

	}

}
