package com.SouravPaul;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Java8HomeTask {
	static double claculate_avg(List <Integer> list)
	{
		double sum = 0;
		  if(!list.isEmpty()) {
		    for (Integer temp : list) {
		        sum += temp;
		    }
		    return sum/ list.size();
		  }
		  return sum;
		}
	
	
	static List <String> stringWithA(List <String> list){
		List<String> filtered = list.stream().filter(x -> x.startsWith("a")).filter(x -> x.length()==3).collect(Collectors.toList());
		return filtered;
	}
	
	
	public static List <String> findPalindrome(List<String> str) 
	{
		List<String> filtered=new ArrayList<String>();
		for(String temp:str)
		{	StringBuilder temp1=new StringBuilder(temp).reverse();
			if(temp1.toString().equals(temp));
			filtered.add(temp);
		}
		return filtered;
	}

}
