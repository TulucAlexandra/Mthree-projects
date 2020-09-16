package com.mthree.daos;
import java.util.ArrayList;
import java.util.Scanner;
import com.mthree.models.Trade;
public interface TradesOp {
	double openPrice(ArrayList<Trade>trades ,String sym);
	double closePrice(ArrayList<Trade>trades,String sym);
	double avgPriceExcludingOpenClose(ArrayList<Trade> trades, String sym);
	double vwap(ArrayList<Trade>trades,String sym);
	void vwapExcludingReportedTrades(ArrayList<Trade>trades,String sym);

}
