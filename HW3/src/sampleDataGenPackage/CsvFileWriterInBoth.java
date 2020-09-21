//Write in both files to have the same value for extime time and sym at trade
	package sampleDataGenPackage;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

import Test_ReplayPackage.QuoteDate;
	public class CsvFileWriterInBoth {
		    private static final String COMMA_DELIMITER = ",";
		    private static final String NEW_LINE_SEPARATOR = "\n";
		    private static final String FILE_HEADER = "exTime,time,sym,ask1Price,ask1Size,ask1Count,bid1Price,bid1Size,bid1Count";
		    private static final String FILE_HEADER2 ="exTime,time,sym,price,size,cond";
		    public static void writeCsvFile(String fileName1,String fileName2,ArrayList q1) {
		    	LocalDate time=LocalDate.now();
		    	QuoteDate qt1=new QuoteDate(time,time,"AT",5,5,1,2,5,5);
		    	//QuoteDate qt2=new QuoteDate(time,time,"UT",5,2,3,0,6,9);
		    	List <QuoteDate> quoteDates=new ArrayList();
		    	quoteDates.add(qt1);
		    	//quoteDates.add(qt2);
		    	FileWriter fileWriter = null;
		    	FileWriter fileWriter2=null;
		    	 try {
		             fileWriter = new FileWriter(fileName1);
		             fileWriter2 = new FileWriter(fileName2);
		  
		             //Write the CSV file header
		             fileWriter.append(FILE_HEADER.toString());
		             fileWriter2.append(FILE_HEADER2.toString());

		             //Add a new line separator after the header
		             fileWriter.append(NEW_LINE_SEPARATOR);
		              
		             //Write a new student object list to the CSV file
		             
		             for(QuoteDate  q : quoteDates) {
		                 fileWriter.append(String.valueOf(q.getEXTime()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getTime()));
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(q.getSym());
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(String.valueOf(q.getAsk1Price()));
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(String.valueOf(q.getask1Count()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getbid1Price()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getbid1Size()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getbid1Count()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(NEW_LINE_SEPARATOR);
		                 
		                 fileWriter2.append(String.valueOf(q.getEXTime()));
		                 fileWriter2.append(COMMA_DELIMITER);  
		                 fileWriter2.append(String.valueOf(q.getTime()));
		                 fileWriter2.append(COMMA_DELIMITER); 
		                 fileWriter2.append(q.getSym());
		                 fileWriter2.append(COMMA_DELIMITER);
		             }
		  
		             System.out.println("CSV file was created successfully!!!");
		    	 } catch (Exception e) {
		             System.out.println("Error in CsvFileWriter !!!");
		             e.printStackTrace();
		              
		           
		         } finally {
		              
		             try {
		                // fileWriter.flush();
		                 fileWriter.close();
		                 fileWriter2.close();
		             } catch (IOException e) {
		                 System.out.println("Error while flushing/closing fileWriter !!!");
		                 e.printStackTrace();
		             }
		              
		         }
		     }
		 }
		   
