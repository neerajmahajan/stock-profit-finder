package com.mycompany;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for StockProfitFinderTest App.
 */

public class StockProfitFinderTest 
{
    @Test
    public void testBestProfitForSampleData()
    {
    	int[]stockPrices= {10, 7, 5, 8, 11, 9};
    	int expectedProfit = 6;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceListIsNull()
    {
    	int[]stockPrices= null;
    	int expectedProfit = 0;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceListIsEmpty()
    {
    	int[]stockPrices= {};
    	int expectedProfit = 0;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceDeclineThrougoutTheDay()
    {
    	int[]stockPrices= {10,9,8,7,6};
    	int expectedProfit = 0;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceRemainConstantThroughTheDay()
    {
    	int[]stockPrices= {5,5,5,5,5,5,5};
    	int expectedProfit = 0;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceListHasOnlyOnePrice()
    {
    	int[]stockPrices= {100};
    	int expectedProfit = 0;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceContinouslyWentUp()
    {
    	int[]stockPrices= {1,2,3,4,5,6};
    	int expectedProfit = 5;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceConsistentlyWentUpDown()
    {
    	int[]stockPrices= {10,5,15,7,20,7,7,7,7,7,20,2};
    	int expectedProfit = 15;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceWasHighestAtTheEndOfDay()
    {
    	int[]stockPrices= {100,90,95,50,60,45,20,2,102};
    	int expectedProfit = 100;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
    
    @Test
    public void testWhenStockPriceWasLowestAtStartOfDayAndHighestAtTheEndOfDay()
    {
    	int[]stockPrices= {1,5,6,7,2,3,4,100};
    	int expectedProfit = 99;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
   
    @Test
    public void testWhenStockPriceContainsNegativeValues()
    {
    	int[]stockPrices= {5,-4,4};
    	int expectedProfit = 8;
        assertEquals(expectedProfit, StockProfitFinder.findBestProfit(stockPrices) );
    }
}
