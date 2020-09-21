 //write only on trades	
	package sampleDataGenPackage;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

import Test_ReplayPackage.TradeData;
	public class CsvFileWriterTradeOnly {
		    private static final String COMMA_DELIMITER = ",";
		    private static final String NEW_LINE_SEPARATOR = "\n";
		    private static final String FILE_HEADER = "exTime,time,sym,ask1Price,ask1Size,ask1Count,bid1Price,bid1Size,bid1Count";
		    private static final String FILE_HEADER2 ="exTime,time,sym,price,size,cond";
		    public static void writeCsvFile(String fileName ,ArrayList q2) {
		    	LocalDate time=LocalDate.now();
		    	TradeData qt1=new TradeData(time,time,"AT",5,5,1);
		    	TradeData qt2=new TradeData(time,time,"UT",5,2,3);
		    	List <TradeData> tradeDatas=new ArrayList();
		    	tradeDatas.add(qt1);
		    	tradeDatas.add(qt2);
		    	FileWriter fileWriter = null;
		    	 try {
		             fileWriter = new FileWriter(fileName);
		  
		             //Write the CSV file header
		             fileWriter.append(FILE_HEADER2.toString());
		              
		             //Add a new line separator after the header
		             fileWriter.append(NEW_LINE_SEPARATOR);
		              
		             //Write a new student object list to the CSV file
		             
		             for(TradeData  q : tradeDatas) {
		                 fileWriter.append(String.valueOf(q.getExtime()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getTime()));
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(q.getSym());
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(String.valueOf(q.getPrice()));
		                 fileWriter.append(COMMA_DELIMITER);
		                 fileWriter.append(String.valueOf(q.getSize()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(String.valueOf(q.getCond()));
		                 fileWriter.append(COMMA_DELIMITER); 
		                 fileWriter.append(NEW_LINE_SEPARATOR);
		                 
		             }
		  
		             System.out.println("CSV file was created successfully !!!");
		    	 } catch (Exception e) {
		             System.out.println("Error in CsvFileWriter !!!");
		             e.printStackTrace();
		              
		           
		         } finally {
		              
		             try {
		                // fileWriter.flush();
		                 fileWriter.close();
		             } catch (IOException e) {
		                 System.out.println("Error while flushing/closing fileWriter !!!");
		                 e.printStackTrace();
		             }
		              
		         }
		     }
		 
}
