package com.example.demo.latitude;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaxDifferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaxDifferenceApplication.class, args);
		
		System.out.println("*****************calculate max Profit*****************");
		
		double[] stock_prices_yesterday= {10, 7, 5, 8, 11, 9};		
		
        /**
         * call the function get_max_profit 
         */
		double profit= ProfitCalculator.get_max_profit(stock_prices_yesterday);				
		
		System.out.println(" Max Profit:"+profit);
	}
		

	
}
