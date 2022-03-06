package javaclass1;

public class iselsestatementcond {

	public static void main(String[] args) {
		
		// you have three variable 10,20,30 , find out the bigger, medium and smaller number
         // nested if else 
		
		
		int a = 10;
		int b = 90;
		int c = 30;
		
		// assuming that a is bigger
		if (a>b && a>c) {
			System.out.println("the biggest number is "+ a);
		
		if (b>c) {
			System.out.println("The medium number is "+ b);
			System.out.println("The smaller number is "+ c);
		}else {
			System.out.println("The medium number is " + c);
			System.out.println("The smaller number is "+ b);
		}
			 
		 } 
		
		//assuming that b is bigger
		else if (b>a && b>c) {
			 System.out.println("The biggest number is " +b);
			 
			 if (a>c) {
				 System.out.println("The medium number is "+ a); 
				 System.out.println("The smaller number is "+ c);
				 
			 } else {
                  System.out.println("The medium number is "+ c);
                  System.out.println("The smaller number is "+ a );
			 }
		 } 
		
		//assuming that c is bigger
		else if (c>a && c>b) {
			 System.out.println("The biggest number is "+ c);
			 
			 if (a>b) {
				 System.out.println("The medium number is "+ a);
				 System.out.println("The smaller number is "+ b);
			 } else {
				System.out.println("The medium number is "+ b); 
				System.out.println("The smaller number is "+ a);
			 }
		 }
	}
}

