	package sampleDataGenPackage;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

import Test_ReplayPackage.TradeData;
	public class CsvFileReaderTrade {//Delimiter used in CSV file
	    private static final String COMMA_DELIMITER = ",";
	     
	    //Quote Date csv attributes index 
	    private static final int extime_IDX = 0;
	    private static final int time_IDX = 1;
	    private static final int sym_IDX = 2;
	    private static final int ask1Price_IDX= 3; 
	    private static final int ask1Size = 4;
	    private static final int ask1Count_IDX = 5;
	    private static final int bid1Price_ISX = 6;
	    private static final int bid1Size_IDX= 7;
	    private static final int bid1Count_IDX = 8;
	    private static final int  price_IDX=9 ;
	    private static final int  size_IDX=10;
	    private static final int cond_IDX=11;
	    
	    // read from Trade csv file
	    public static void readCsvFileTrade(String fileName) {
			BufferedReader fileReader = null;
			String[] tokens=null;
			try {
				List <TradeData> tradeDatas=new ArrayList();
				String line=" ";
				fileReader = new BufferedReader(new FileReader(fileName));
				fileReader.readLine();
				//Read the file line by line starting from the second line
	            while ((line = fileReader.readLine()) != null) {
	                //Get all tokens available in line
	                 tokens = line.split(COMMA_DELIMITER);
	             while(tokens.length!=0)
	                {
	                    TradeData trd = new TradeData(LocalDate.parse(tokens[extime_IDX]),LocalDate.parse(tokens[time_IDX]),tokens[sym_IDX],Integer.parseInt(tokens[price_IDX]),Integer.parseInt(tokens[size_IDX]),Integer.parseInt(tokens[cond_IDX]));
	                    tradeDatas.add(trd);
	                }
	            }
	             for(TradeData  t : tradeDatas)  {
	                System.out.println(t.toString());
	            }
			}
	         catch (Exception e) {
	        	 System.out.println("Error in CsvFileReader !!!");
	        	 e.printStackTrace();
	         } finally {
	        	 try {
	    fileReader.close();
	} catch (IOException e) {
	    System.out.println("Error while closing fileReader !!!");
	    e.printStackTrace();
							}

	         			}		
													
			}
	    }