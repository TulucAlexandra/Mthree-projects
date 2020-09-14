import java.util.*;

import java.util.function.Supplier;

import java.util.Random;

 
public class Main
{
  
public static void main (String args[]) 
  {
    
Random rand = new Random ();	
    int upperbound = 100;
    
List < Integer > list = new ArrayList < Integer > ();
    
 
      
      for (int i = 0; i < 100; i++)
      
      {
	
 
 
int int_random = rand.nextInt (upperbound);
	
list.add (int_random);
	
 
 
System.out.println ("Random integer value from 0 to" +
				 (upperbound - 1) + " : " + int_random);
      
 
 
} 
System.out.println ("ArrayList : " + list.toString ());

 
} 
} 
