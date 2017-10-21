package javaprograms;

public class MethodsEg {

	//Static method with out returning any value
	public static void function1()
	{
		System.out.println("Function1 code");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1();
		String res = function2();
		System.out.println(res);
		MethodsEg m = new MethodsEg();
		m.function3();
		boolean res1=m.function4();
		System.out.println(res1);

	}
	//Static method with return type
	public static String function2()
	{
		System.out.println("Function2 code");
		return "Pass";
	}
	//NonStatic method without return type
	public void function3()
	{
		System.out.println("Function3 code");
	}
	//NonStatic method with return type
	public boolean function4()
	{
		System.out.println("Fuction4 code");
		return true;
	}

}
