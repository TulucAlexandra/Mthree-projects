import java.util.*;

import java.util.function.Supplier;

import java.util.Random;

 
public class Main
{
  
public static void main (String args[]) 
  {
    
Random rand = new Random ();	//instance of random class
    int upperbound = 1000;
    
List < Integer > list = new ArrayList < Integer > ();
    
 
      // For ArrayList 
      for (int i = 0; i < 100; i++)
      
      {
	
 
 
int int_random = rand.nextInt (upperbound);
	
list.add (int_random);
	
 
 
System.out.println ("Random integer value from 0 to" +
				 (upperbound - 1) + " : " + int_random);
      
 
 
} 
System.out.println ("ArrayList : " + list.toString ());
list.stream() //
    .max(Comparator.comparing(i -> i)) //
    .ifPresent(max -> System.out.println("Maximum found is " + max));
list.stream() //
    .min(Comparator.comparing(i -> i)) //
    .ifPresent(min -> System.out.println("Minimum found is " + min));
list.stream() //
    .mapToInt(i -> i) //
    .average() //
    .ifPresent(avg -> System.out.println("Average found is " + avg));

    
} 
} 
