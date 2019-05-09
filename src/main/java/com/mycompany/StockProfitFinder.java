package com.mycompany;

/**
 * StockProfitFinder
 * 
 * This class provide function to calculate the best profit a person can make by doing one purchase and sale transaction of stock in a day.
 * 
 * This solution is prepared based on following assumptions
 * 
 * Assumption 1: If Stock Price continuously declined throughout the day and never went up, then the solution will return 0 profit value. For eg int[] stockPrice = {5,4,3,2,1}
 * Assumption 2: If Stock Price list is empty or null then a 0 profit value will be returned.
 * Assumption 3: StockPrice list can contain non-negative values.
 * Assumption 4: If the StockPrice list contains only only stockPrice value, then 0 profit value would be returned.
 * 
 */

public class StockProfitFinder {

	public static int findBestProfit(int[] stockPrices) {
		
		int bestProfit = 0;
		
		if (stockPrices == null || stockPrices.length == 0) {
			return bestProfit;
		}

		
		int minStockPrice = stockPrices[0];

		for (int indices = 1; indices < stockPrices.length; indices++) {

			if (checkIfCurrentStockPriceIsLower(stockPrices, minStockPrice, indices)) {
				minStockPrice = stockPrices[indices];
			}

			int profitWithCurrentStockPrice = stockPrices[indices] - minStockPrice;

			if (profitWithCurrentStockPrice > bestProfit) {
				bestProfit = profitWithCurrentStockPrice;
			}
		}
		return bestProfit;
	}

	private static boolean checkIfCurrentStockPriceIsLower(int[] stockPrices, int minStockPrice, int indices) {
		return stockPrices[indices] < minStockPrice;
	}
}
