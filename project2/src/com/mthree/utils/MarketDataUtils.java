package com.mthree.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import com.mthree.models.Trade;

public class MarketDataUtils {
	
	
	public static ArrayList<Trade> createTrades(){
		
		ArrayList<Trade> trades = new ArrayList<>();
		 for (int i = 0; i < 200; i++) { 
			 //trades.add(new Trade ("Student i ", 54.25,i ,"ffffd","fff")); 
			   
			  //ArrayList<Float> floats = new ArrayList<>(Arrays.asList(3.14f, 6.28f, 9.56f));
			
		        LocalDate date = LocalDate.now();
		        LocalTime time = LocalTime.now();
		        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
		      
		  
			 Trade obj1= new Trade("vod", 1.32,1000,dateTime2,"AT"); 
		     Trade obj2= new Trade("bt",2.33,2100,dateTime2,"IX"); 
			  trades.add(obj1);
			  trades.add(obj2);
			  
		        System.out.println("dateTime2 = " + dateTime2);
			  for ( Trade  ob :trades)
			  {
				  System.out.println(ob.price); 
			  }
			  //trades.add(new Trade ("Student B", 54.25,1,"ffffd","fff")); 
		    //trades.add(new Trade ("Student C", 56.25,2,"ffffdff","fffbb")); 
		    //System.out.println(((Object) trades).price()); 
	  
        }
		 
		return trades;
	}

}
