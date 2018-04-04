package com.example.demo.latitude;

public class ProfitCalculator {

	public static double get_max_profit(double[] arr)
	{
	    double diff=0;
	    /**
	     *  find if the array is sorted in descending order, 
	     *  like {5,4,2} then no profit 
	     */
	    boolean sorted = true;
	    for (int i = 0; i <arr.length-1; i++) {
		    if (arr[i] < arr[i+1]) {
		        sorted = false;
		        break;
		    }
		}
	    
	    /**
	     * Calculate Profit
	     */
	   	    
	    if(!sorted) {
	    	
	    	double min_element=arr[0];
		    diff=arr[1]-arr[0];
	    	for(int i=1;i<arr.length;i++)
		    {
		        if(arr[i]-min_element>diff)
		            diff=arr[i]-min_element;
		        if(arr[i]<min_element)
		            min_element=arr[i];
		    }
	    	
	    	System.out.println("Profit:"+diff+" (buying for $ "+min_element +" and selling for $" + (min_element+diff) +")" );
	    }	      	    
	    return diff;
	}
}
