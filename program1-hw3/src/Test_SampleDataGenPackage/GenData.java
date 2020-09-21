package Test_SampleDataGenPackage;
import java.io.File;
 import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
 public class GenData {
 public static void main(String[] args) {
 try {
   PrintWriter pw1= new PrintWriter(new File("C:\\Users\\HP Pavilion Notebook\\eclipse-workspace\\program1-hw3\\quote_data.csv"));
   PrintWriter pw2= new PrintWriter(new File("C:\\Users\\HP Pavilion Notebook\\eclipse-workspace\\program1-hw3\\trade_data.csv"));
   StringBuilder qt=new StringBuilder();
   StringBuilder td=new StringBuilder();
  
     qt.append("exTime");
   		qt.append(",");
   		qt.append("time");
   		qt.append(",");
   		qt.append("sym");
   		qt.append(",");
   		qt.append("ask1Price");
   		qt.append(",");
   		qt.append("ask1Size"); 
   		qt.append(",");
   		qt.append("ask1Count");
   		qt.append(",");
   		qt.append("bid1Price");
   		qt.append(",");
   		qt.append("bid1Size");
   		qt.append(",");
		qt.append("bid1Count");
		qt.append(",");
		
   		td.append("ex.Time");
   		td.append(",");
   		td.append("time");
   		td.append(",");
   		td.append("sym");
   		td.append(",");
   		td.append("price");
   		td.append(",");
   		td.append("size");
   		td.append(",");
   		td.append("cond");
   		td.append(",");
   	 pw1.write(qt.toString());
   	 pw2.write(td.toString());
   pw1.close();
   pw2.close();
   System.out.println("finished");
   } catch (Exception e) {
     
   }
}
}
}
