
public class HJJJ {

	public static void main(String[] args) {
		int number=4;
		try{
			number=10/0;
		}catch(ArithmeticException exception){
			System.out.println("Exception::"+exception);
			}
		
	finally{
		System.out.println("Huraah!!");
		System.out.println(number);
	}

}
}
