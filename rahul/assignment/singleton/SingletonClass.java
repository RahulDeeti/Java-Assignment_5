package rahul.assignment.singleton;
public class SingletonClass
{
	String str;
	public static SingletonClass getInstance(String str)
	{
		SingletonClass sobj = new SingletonClass();
		sobj.str = str;
		return sobj;
	}
	public void printString()
	{
		System.out.println(str);
	}
}