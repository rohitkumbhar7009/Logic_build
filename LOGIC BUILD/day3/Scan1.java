import java.util.Scanner;
class Scan1
{
     public static void  main(String args [])
     {
	     Scanner sc = new Scanner("709 125");//Declaration of Scanner class object
		 System.out.println("Enter integer number1:");//Msg 
		 int n1 = sc.nextInt();//Getting the input from user
		 
		 System.out.println("Enter integer number2:");//Msg
		 int n2 = sc.nextInt();// Getting the input from user 
		 
		 int k = n1+n2;
		 System.out.println("Display sum= "+k);
		 
     }
}

