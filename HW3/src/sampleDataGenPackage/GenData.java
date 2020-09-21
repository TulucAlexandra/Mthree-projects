package sampleDataGenPackage;

import java.io.File;
 import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import Test_ReplayPackage.QuoteDate;
import Test_ReplayPackage.TradeData;
 public class GenData {
 public static void main(String[] args) {
 try {
   PrintWriter pw1= new PrintWriter(new File("C:\\Users\\HP Pavilion Notebook\\eclipse-workspace\\HW3\\quote_data.csv"));
   PrintWriter pw2= new PrintWriter(new File("C:\\Users\\HP Pavilion Notebook\\eclipse-workspace\\HW3\\trade_data.csv"));
   StringBuilder qt=new StringBuilder();
   StringBuilder td=new StringBuilder();
   LocalDate date = LocalDate.of(2020, 1, 8);
   LocalDate date1 = LocalDate.of(2020, 1, 8);
   
   TradeData qt1=new TradeData(date, date1, "at", 5, 5, 2);
   ArrayList <TradeData> tradelist=new ArrayList();
   ArrayList <QuoteDate> quotelist=new ArrayList();
   tradelist.add(qt1);

    QuoteDate qt11=new QuoteDate(date,date1,"AT",5,5,1,2,5,5);
	QuoteDate qt21=new QuoteDate(date,date1,"UT",5,2,3,0,6,9);
	quotelist.add(qt11);
	quotelist.add(qt21);

	CsvFileWriterInBoth.writeCsvFile("quote_data.csv", "trade_data.csv", 	quotelist);
   pw1.close();
   pw2.close();
   System.out.println("finished");
   } catch (Exception e) {
     
   }
}
}