package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;

public class CacheFactorial {
	List<Long> cache = new ArrayList<>();
	public long factorial(int n) {
		
		if(cache.size() >= n) {
			
			System.out.println("returning from cache");
		return cache.get(n-1) ;
		}
		
		if(n==1) {
			cache.add(1l);
			return 1;
		}
		long fact = factorial(n-1);
		long factn = n * fact;
		
		cache.add(fact);
		return  factn;
		
	}
	
}