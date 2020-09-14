/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
  /******************************************************************************
    
                                Online Java Compiler.
                    Code, Compile, Run and Debug java program online.
    Write your code in this editor and press "Run" button to execute it.
    
    *******************************************************************************/
import java.util.Scanner;
import java.lang.Object;
public class Main
{

  public static void main (String[]args)
  {
    String str;
    System.out.println ("Welcome to the calculator ");
    int m, n, opt, add, sub, mul, n1;
    double div;
    boolean i = true;
    boolean flag = false;
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter two numbers by turn :");
    if (sc.hasNextInt ())
        System.out.println ("This input is of type Integer.");
      n = sc.nextInt ();

    if (sc.hasNextInt ())
        System.out.println ("This input is of type Integer.");
      m = sc.nextInt ();

    while (i)
      {
	System.out.print("PRESS 1 for addition ,  2 for subtraction,  3 for multiplication,  4 for division,  5 to all or 6 to Exit");
	Scanner option = new Scanner (System.in);
	  opt = sc.nextInt ();
	switch (opt)
	  {
	  case 1:
	    add = m + n;
	    System.out.println ("Result:" + add);
	    break;
	    case 2:sub = m - n;
	    System.out.println ("Result:" + sub);
	    break;

	    case 3:mul = m * n;
	    System.out.println ("Result:" + mul);
	    break;

	    case 4:div = (double) m / n;
	    System.out.println ("Result:" + div);
	    break;

	    case 5:System.out.println ("\nAddition of " + n + "+" + m +
				       " = " + (n + m));
	    System.out.println ("Substraction of " + n + "-" + m + " = " +
				(n - m));
	    System.out.println ("Multiplication of " + n + "x" + m + " = " +
				(n * m));
	    System.out.println ("Division of " + n + "/" + m + " = " +
				(n / m));

	    System.out.println ("This is all to display ");
	    case 6:System.exit (0);
	  }

 
      }

  }
}