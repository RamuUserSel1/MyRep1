package javaprograms;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [][] s= new Object[2][3];
		//multipe types of data can be stored in object array
		s[1][0]=700;
		s[1][1]="heo";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
				System.out.println(s[i][j]);
		}

	}

}
