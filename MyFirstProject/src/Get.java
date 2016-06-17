
public class Get {

	public static void main(String[] args){

		Student mark =new Student();
		Student tom =new Student();
		mark.setAge(15);
		mark.setName("mark");
		mark.setRoll_no(23);
		
		tom.setAge(18);
		tom.setName("tom");
	tom.setRoll_no(26);
		
		
		

		

		System.out.println(mark.getName() + " is "+  mark.getAge()+" years old ");
		System.out.println(tom.getName() + " is "+  tom.getAge()+" years old ");
	
	

	}

}
