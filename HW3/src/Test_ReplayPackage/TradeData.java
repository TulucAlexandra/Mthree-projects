package Test_ReplayPackage;
import java.time.LocalDate;
public class TradeData {

	
		private LocalDate extime;
	    private LocalDate time;
	    private String sym;
	    private int price;
	    private int size;
	    private int cond;
	    
		public TradeData(LocalDate extime, LocalDate time, String sym, int price, int size, int cond) {
			super();
			this.extime = extime;
			this.time = time;
			this.sym = sym;
			this.price = price;
			this.size = size;
			this.cond = cond;
		}
		@Override
		public String toString() {
			return "TradeData [extime=" + extime + ", time=" + time + ", sym=" + sym + ", price=" + price + ", size="
					+ size + ", cond=" + cond + "]";
		}
		public LocalDate getExtime() {
			return extime;
		}
		public void setExtime(LocalDate extime) {
			this.extime = extime;
		}
		public LocalDate getTime() {
			return time;
		}
		public void setTime(LocalDate time) {
			this.time = time;
		}
		public String getSym() {
			return sym;
		}
		public void setSym(String sym) {
			this.sym = sym;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getCond() {
			return cond;
		}
		public void setCond(int cond) {
			this.cond = cond;
		}
	    
	

}
