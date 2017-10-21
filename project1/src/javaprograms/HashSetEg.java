package javaprograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Object> x = new HashSet<Object>();
		//Write data into hashset
		x.add(50000);
		x.add(555.55);
		x.add(true);
		x.add('M');
		//Reading data from HashSet
		Iterator<Object> it = x.iterator();
		x.add(true);
		//HashSet will not allow you to store duplicates.
		while(it.hasNext())
		{
			Object data =it.next();
			System.out.println(data);
		}
		

	}

}
