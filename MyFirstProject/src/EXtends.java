
public class EXtends {

	public static void main(String[] args) {
	
	
A obj=new B();
obj.show();
B ob=new B();
ob.show1();
ob.show();
System.out.println(ob.i);
	}

}
class A
{  
	 int i=5;
	public void show()
	{
		System.out.println("I am in A");
	}
}
class B extends A
{
	public void show1()
	{
		System.out.println("I am in B");
		show();
		System.out.println(i);
	
	}

}