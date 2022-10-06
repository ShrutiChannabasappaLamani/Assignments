package com.valtech.training.corejava.day4;

public class VarArgs {
	public int add(int ... a) {
		int res = 0;
		for(int i : a) {
			res+=1;  // res = res + 1;
		}
		return res;
	}

}
