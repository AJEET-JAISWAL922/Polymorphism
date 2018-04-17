package pack1;
class Add
{
	void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
}

public class MethodOverloading {

	public static void main(String   args[])
	{
		Add obj = new Add();
		obj.add(10, 20);
		obj.add(1, 2, 3);
	}
}
