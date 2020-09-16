package com.mthree.models;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;
public class Trade {
	public String sym;
	public double price;
	public int size;
	public LocalDateTime datetime;
	public String  cond;
	public Trade(String sym, double price, int size, LocalDateTime string, String cond) {
		super();
		this.sym = sym;
		this.price = price;
		this.size = size;
		this.datetime = string;
		this.cond = cond;
	}
	public String getVod() {
		return sym;
	}
	public void setVod(String vod) {
		this.sym = sym;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String getCond() {
		return cond;
	}
	public void setCond(String cond) {
		this.cond = cond;
	}

}
