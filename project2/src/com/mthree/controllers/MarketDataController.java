package com.mthree.controllers;

import java.util.ArrayList;

import com.mthree.daos.TradesOp;
import com.mthree.models.Trade;

public class MarketDataController {
	
	
	private TradesOp op;

	public MarketDataController(TradesOp op) {
		super();
		this.op = op;
	}
	
	
	public void findOpenPrice(ArrayList<Trade> trades,String sym) {
		op.openPrice(trades, sym); 
	}
	
	
	public void findClosePrice(ArrayList<Trade> trades,String sym) {
		op.closePrice(trades, sym);
	}
	
	
	public void findAvgPriceExcludingOpenClose(ArrayList<Trade> trades,String sym) {
		op.avgPriceExcludingOpenClose(trades, sym); 
	}
	
	
	public void findVwap(ArrayList<Trade> trades,String sym) {
		op.vwap(trades, sym);
	}
	public void findVwapExcludingReportedTrades(ArrayList<Trade> trades,String sym) {
		op.vwapExcludingReportedTrades(trades, sym);
	}

}
