package workspace;

import java.util.*;
import java.util.Map.Entry;

import java.lang.*;
import java.io.*;

class Main
{
    private static final NavigableMap<Long, String> format = new TreeMap<>();

	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
		long value = Long.parseLong(console.readLine());
		int decimalPlaces = Integer.parseInt(console.readLine());
		boolean addDecimalForSingleDigit = (console.readLine().equals("1")) ? true : false;
		String output = GraduatedValue(value, decimalPlaces, addDecimalForSingleDigit);
		System.out.println(output);
	}
	
	public static String GraduatedValue(long value, int decimalPlaces, boolean addDecimalForSingleDigit)
	{
        format.put(1_000L, "K");
        format.put(1_000_000L, "M");
        format.put(1_000_000_000L, "B");
        format.put(1_000_000_000_000L, "T");

        if(value < 0){
            return "-" + GraduatedValue(-value, decimalPlaces, addDecimalForSingleDigit);
        }

        if(value < 1000){
            return String.valueOf(value);
        }

        Entry<Long, String> e = format.floorEntry(value);
        Long div = e.getKey();
        String form = e.getValue();

        long newValue = value / (div/10);
        boolean decimal = newValue < 100 && (newValue/10d) != (newValue/10);
        //return decimal ? (newValue/10d) + form : (newValue/10) + form;

        return decimal ? Math.pow(newValue/10d, -decimalPlaces) + form : newValue/10 + form;
	}
}
