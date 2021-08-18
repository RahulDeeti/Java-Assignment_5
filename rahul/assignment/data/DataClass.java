package rahul.assignment.data;
public class DataClass
{
	int a;
	char ch;
	public void printGlobal()
	{
		System.out.println(a);
		System.out.println(ch);
	}
	public void printLocal()
	{
		int val;
		int letter;
		System.out.println(val);
		System.out.println(letter);
	}
}