package Test_ReplayPackage;

import java.time.LocalDate;

public class QuoteDate {
	
	private LocalDate extime;
    private LocalDate time;
    private String sym;
    private int ask1Price;
    private int ask1Size;
    private int ask1Count;
    private int bid1Price ;
    private int bid1Size;
    private int bid1Count;
    
	
	public QuoteDate(LocalDate extime, LocalDate time, String sym, int ask1Price, int ask1Size, int ask1Count,
			int bid1Price, int bid1Size, int bid1Count) {
		super();
		this.extime = extime;
		this.time = time;
		this.sym = sym;
		this.ask1Price = ask1Price;
		this.ask1Size = ask1Size;
		this.ask1Count = ask1Count;
		this.bid1Price = bid1Price;
		this.bid1Size = bid1Size;
		this.bid1Count = bid1Count;
	}
	@Override
	public String toString() {
		return "QuoteDate [extime=" + extime + ", time=" + time + ", sym=" + sym + ", ask1Price=" + ask1Price
				+ ", ask1Size=" + ask1Size + ", ask1Count=" + ask1Count + ", bid1Price=" + bid1Price + ", bid1Size="
				+ bid1Size + ", bid1Count=" + bid1Count + "]";
	}
	public LocalDate getEXTime() {
        return extime;
    }
    
    public void setEXTime(LocalDate extime) {
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
    
    public int getAsk1Price() {
        return ask1Price;
    }
    public void setAsk1Price1(int ask1Price) {
        this.ask1Price = ask1Price;
    }
    public int getAsk1Size() {
        return ask1Size;
    }
    public void setAsk1Size(int ask1Size) {
        this.ask1Size = ask1Size;
    }
    public int getask1Count() {
        return ask1Count;
    }
    public void setask1Count(int ask1Count) {
        this.ask1Count = ask1Count;
    }
    public int getbid1Price() {
        return bid1Price;
    }
    public void setbid1Price(int bid1Price) {
        this.bid1Price = bid1Price;
    } 
    public int getbid1Size() {
        return bid1Size;
    }
    public void setbid1Size(int bid1Size) {
        this.bid1Size = bid1Size;
    } 
    public int getbid1Count() {
        return bid1Count;
    }
    public void setbid1Count(int bid1Count) {
        this.bid1Count = bid1Count;
    } 
}

