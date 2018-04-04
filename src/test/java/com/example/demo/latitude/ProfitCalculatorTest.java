package com.example.demo.latitude;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.assertj.core.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProfitCalculatorTest {
	
	private double profit;
	private double[] stockPrices;
	private double expectedResult;
	private ProfitCalculator pc;
	
	

	public ProfitCalculatorTest(double[] stockPrices, double expectedResult) {
		super();
		//this.profit = profit;
		this.stockPrices = stockPrices;
		this.expectedResult = expectedResult;
	}

	@Before
	public void setUp() throws Exception {
		 pc= new ProfitCalculator();
	}
	
	@Parameterized.Parameters
	public static Collection inputs() {	
		double[] input1 = {1,2};
		double[] input2 = {10, 7, 5, 8, 11, 9};
		double[] input3 = { 99,100, 25, 1, 2,5,7, 9, 3, 4, 10, 100};
		double[] input4 = {4,3,2,1};
		
		return Arrays.asList(new Object[][] {{input1,1},{input2,6},{input3,99},{input4,0}});
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println("profit:"+expectedResult);
		double delta=0.1;		
		assertEquals(expectedResult, pc.get_max_profit(stockPrices), delta);
		
	}

}
