package fclass;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello world");
		
		//primitive type
        int myAge=30;
        int herAge=myAge;
        byte age=25;
        long viewCount=7_772_345_678L;
        float salary=56.78F;
        char ch='D';
        boolean isEligible=true;
        System.out.println(isEligible);
        
        
        //Reference type
        Date now =new Date();
        System.out.println(now);
        Point p1=new Point(4,5);
        Point p2=p1;//Referencing
        p1.x=40;
        System.out.println(p2+" "+p1);
        
        
        //String
        String message1=new String("Hello");
        String message2= "World ";
        String message3=message1+" "+message2;
        System.out.println(message3.length());
        System.out.println(message3.toLowerCase());
        System.out.println(message3.toUpperCase());
        System.out.println(message3.trim());
        System.out.println(message3.indexOf('l'));
        System.out.println(message3.startsWith("e"));
        System.out.println(message3.endsWith("ld"));
        String msg4= message3.replace("World","Bithi");
        System.out.println(msg4);
        System.out.println(message3);
        
        //Array
        int arr[]=new int[5];
        arr[0]=3;
        arr[1]=6;
        arr[2]=3;
        arr[3]=6;
        arr[4]=3;
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr1[]= {2,14,5,65,8};
        for(int i=0;i<arr1.length;i++)
        {
        	System.out.print(arr1[i]+" ");
        }
        
        Arrays.sort(arr1);
        arr1[2]=50;
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        int[][] arr2= new int[2][2];
        arr2[0][0]=1;
        arr2[0][1]=2;
        arr2[1][0]=3;
        arr2[1][1]=4;
        System.out.println(Arrays.deepToString(arr2));
        int[][] arr3= {{1,2},{2,3},{4,5}};
        System.out.println(Arrays.deepToString(arr3));
        
        
        //escape sequence
        System.out.println("My name is \"Bithi\". ");
        System.out.println("My name is \nBithi. ");
        System.out.println("My name is \\Bithi\\. ");
        System.out.println("My name is \tBithi. ");
        
        
        //constant
        final float PI=3.14F;
        System.out.println(PI);
        
        
        //operator
        double c= (double)10/(double)3;
        int remainder= 45%6;
        int x=1;
        int y= ++x;
        int z=x;
        z+=5;//augmented assignment operator
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z);
        System.out.println(remainder);
        System.out.println(c);
        
        
        //casting
        //byte short int long float double
        double a=7.88;
        double b=a+2;//implicit casting
        System.out.println(b);
        int c1= (int)b+1;
        System.out.println(c1);
        String n="50";
        int m=Integer.parseInt(n);
        double d=Double.parseDouble(n);
        double ans=d+2;
        System.out.println(ans);
        System.out.println(Math.floor(56.7F));
        System.out.println(Math.ceil(56.7F));
        System.out.println(Math.max(56,7));
        System.out.println(Math.min(56,7));
        System.out.println(Math.round(56.7));
        System.out.println(Math.random()*100);//0-1 value
        System.out.println(Math.round(Math.random()*100));
        
        
        //Number Formatting
        String num1= NumberFormat.getCurrencyInstance().format(1234567.8976);
        System.out.println(num1);
        NumberFormat num2= NumberFormat.getPercentInstance();
        String percent= num2.format(.67);
        System.out.println(percent);
        
        
        //input
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
       String input=sc.next().trim(); //like scanf
        System.out.println(input);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter another string: ");
        String input1=sc1.nextLine().trim();//like gets()
        System.out.println(input1);
        
        
        //Mortgage calculation
       
       double mortgage;
       final int monthsInYear=12;
       final int percent1=100;
       
       System.out.print("Principal: ");
       double principal=sc.nextDouble();
       System.out.print("Interest rate: ");
       double yearlyInterest=sc.nextDouble();
       System.out.print("Years: ");
       int numOfYear=sc.nextInt();
       
       double monthlyInterest=yearlyInterest/monthsInYear/percent1;
       double numOfMonth=numOfYear*monthsInYear;
       
  
       mortgage= (principal*monthlyInterest*Math.pow(monthlyInterest+1,numOfMonth))/(Math.pow(monthlyInterest+1,numOfMonth)-1);
       String mortageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
       System.out.println(mortageFormatted);
       
       
        //conditional operator
        int x1=6;
        int y1=6;
        System.out.println(x1==y1);
        System.out.println(x1<y1);
        System.out.println(x1>=y1);
        System.out.println(x1!=y1);
        
        int temp=25;
        if(temp>30)
        {
        	System.out.println("Hot day");
        }
        else if(temp>20)
        {
        	System.out.println("Beautiful day");
        }
        else
        {
        	System.out.println("Cold day");
        }
        int income=10_000;
        String className=income>100_000?"First":"Second";
        System.out.println(className);
        
        
        
        //control statement
        int n1=sc.nextInt();
        if(n1%3==0 && n1%5==0)
        {
        	System.out.println("FizzBuzz");
        }	
        else if(n1%5==0)
        {
        	System.out.println("Fizz");
        }
        else if(n1%3==0)
        {
        	System.out.println("Buzz");
        }	
     
        else
        {
        	System.out.println(n1);
        }	
        
	

		//for loop
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Nasima "+i);
		}
		for(int i=5;i>=1;i--)
		{
			System.out.println("Hello Nasima "+i);
		}
		
		
		//while loop
	    String word="";
		while(true)
		{
			word=sc.next().toLowerCase();
			if(word.equals("quit"))
			{
				break;
			}
			System.out.println(word);
		}
		
		
		//for each loop
		String[] fruits= {"mango","banana","jackfruit"};
		for(int i=0;i<fruits.length;i++)
			System.out.println(fruits[i]);
		for(String i:fruits)
		{
			System.out.println(i);
		}
		
		//improved mortgage calculation
		   double mortgage1;
	       double principal1;
	       double yearlyInterest1;
	       int numOfYear1;
	       
	       while(true) {
	       double pri;
	       System.out.println("Principal ($1k - $1M): ");
	       pri=sc.nextDouble();
	       if(pri>=1_000 && pri<=1_000_000)
	       {
	    	   principal1=pri;
	    	   break;
	       }
	       }
	       while(true) {
	    	   System.out.print("Interest rate (0 - 10): ");
		       double intr=sc.nextDouble();
		       if(intr>=0 && intr<=10)
		       {
		    	   yearlyInterest1=intr;
		    	   break;
		       }
		       }
	       
	       
	       while(true) {
	    	   System.out.print("Period (0 - 30 years): ");
		     int year=sc.nextInt();
		       if(year>=0 && year<=30)
		       {
		    	   numOfYear1=year;
		    	   break;
		       }
		       }
	       
	      
		   double monthlyInterest1=yearlyInterest1/monthsInYear/percent1;
	       double numOfMonth1=numOfYear1*monthsInYear;
	       
	  
	       mortgage1= (principal1*monthlyInterest1*Math.pow(monthlyInterest1+1,numOfMonth1))/(Math.pow(monthlyInterest1+1,numOfMonth1)-1);
	       String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage1);
	       System.out.println(mortgageFormatted);
	       
	       
	    //error show  
		System.out.println("This is an normal message");
		System.err.print("This is an error message");
		//single line
		/**
		 * multi
		 * line 
		 * comment
		 
	average(6,4);
	 */
	String[] fruit= {"mango","banana","jackfruit"};

	try {
	System.out.println(fruit[4]);
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
	System.out.println(Arrays.toString(fruit));
	}	
	static void average(int a, int b)
	{
		System.out.print((a+b)/2);
	}
	
}
