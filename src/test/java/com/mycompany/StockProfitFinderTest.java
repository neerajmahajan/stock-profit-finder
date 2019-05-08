package com.mycompany;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for StockProfitFinderTest App.
 */

public class StockProfitFinderTest 
{
    @Test
    public void testApp()
    {
    	int[]stockPrices= {10, 7, 5, 8, 11, 9};
        assertEquals(6, StockProfitFinder.findBestProfit(stockPrices) );
    }
}
