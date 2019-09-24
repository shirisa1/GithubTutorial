package com.dingus;

import java.util.ArrayList;
import java.util.List;

public class Duck {
	public static void main(String[] args) {
		System.out.println("Dingus Ducks Dingus");
		List<String> list = new ArrayList<String>();
		list.add("Barack Obama");
		list.add("Michelle Obama");
		list.add("Sasha Obama");
		list.add("Malia Obama");
		
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
