import java.util.*;

class Quadratic{
	public static void main (String []args)
	{
	    /* Quadratic form 
	       ax^2 + bx = 0*/
	    System.out.println("Enter  a,b values :");
	   Scanner sc= new Scanner(System.in);
	   double a = sc.nextDouble();
	   double b = sc.nextDouble();
	   double result1 = 0.0;
	   double result2 = -b / a;
	   double D = b * b;
	   
	   System.out.println(result1);
	   System.out.println(result2);
	   
	   if(D>0){
	   System.out.println("Roots are Real and Distinct");
	   }else if (D ==0){
	   System.out.println("Roots are Equall");
	   }else{
	   System.out.println("Roots are Imaginary");
	   }
	   
	}
}
