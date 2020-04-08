import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Template code to help you parse the standard input 
 * according to the problem statement.
 **/
class Solution {
	
	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		// read values with in.next...() methods
		String[] stockPrices =in.nextLine().split(" ");

		// code your solution here
		List<Integer> allProfits = new ArrayList();
		int currentMin =  Integer.parseInt(stockPrices[0]);

		for (int i= 0; i< stockPrices.length-1 ; i++) {
			if(currentMin < Integer.parseInt(stockPrices[i+1])) {
				allProfits.add(Integer.parseInt(stockPrices[i+1]) - currentMin);
			} else {
				currentMin = Integer.parseInt(stockPrices[i+1]);
			}
		}

		int value = allProfits.stream().mapToInt(m -> m).max().orElse(0);
		// Write result with System.out.println()
		System.out.println( value);
	}
}
