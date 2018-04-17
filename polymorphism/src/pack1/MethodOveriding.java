package pack1;

class SamsungGalaxy
{
	void memory()
	{
		System.out.println("2GB");
	}
	
}
class SamsungEdge extends SamsungGalaxy
{
	void memory()
	{
		System.out.println("4GB");
		
	}
}

public class MethodOveriding {

	public static void main(String args[])
	{
	Object	obj = new SamsungEdge();
	((SamsungGalaxy) obj).memory();
	}
}
