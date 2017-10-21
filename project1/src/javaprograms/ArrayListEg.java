package javaprograms;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> x  = new ArrayList<String>();
		//Write data into arrayList
		x.add("Selenium");
		x.add("UFT");
		x.add("Manual");
		x.add("Selenium");
		x.add(4,"Rose");
		x.add(5,"Test5");
		//Array List allows to store duplicates.
		System.out.println(x.size());
		//Read data from arrayList
		for(int i=0;i<x.size();i++)
			System.out.println(x.get(i));
		

	}

}
