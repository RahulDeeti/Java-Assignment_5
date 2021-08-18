package rahul.assignment.main;
import rahul.assignment.singleton.*;
import rahul.assignment.data.*;
public class MainClass
{
	public static void main(String[] args)
	{
		DataClass dc = new DataClass();
		dc.printGlobal();
		dc.printLocal();
		SingletonClass sobj = SingletonClass.getInstance("Hello");
		sobj.printString();
	}
}