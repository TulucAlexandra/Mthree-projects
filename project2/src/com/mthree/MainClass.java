package com.mthree; 
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import com.mthree.controllers.MarketDataController;
import com.mthree.models.Trade;
import com.mthree.services.TradeOpImpl;
import com.mthree.utils.MarketDataUtils;
public class MainClass {
 public static void main(String[] args) {
	 	ArrayList<Trade> trades = MarketDataUtils.createTrades();
	     
	   MarketDataController ctrl = new MarketDataController(new TradeOpImpl());
	   
	   
	   ctrl.findOpenPrice(trades, "vod");
	   ctrl.findClosePrice(trades,"vod");
	   ctrl.findAvgPriceExcludingOpenClose(trades, "vod");

		ctrl.findVwap(trades,"vod");
		ctrl.findVwapExcludingReportedTrades(trades,"vod");
 }
}
