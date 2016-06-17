interface C
{
	public void show();
}
class Example implements C{
	public void show()
	{
		System.out.println("Ritu");
	}
	public void display()
	{
		System.out.println("Yashasvi");
	}
}
class Interface{
	
	public  static void  main(String[] args){
		Example ex=new Example();
	ex.show();
	ex.display();
	}
}
