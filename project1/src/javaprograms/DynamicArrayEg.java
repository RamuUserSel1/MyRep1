package javaprograms;

public class DynamicArrayEg {
	public static void main(String [] args)
	{
		int [] s= new int[5];
		//write data into array
		s[2]=20000;
		s[4]=50000;
		for (int data:s)
			System.out.println(data);
		
		String [] a = new String[5];
		
		a[0]= "hello";
		a[3]="hai";
		for(String d:a)
			System.out.println(d);
		
	}

}
