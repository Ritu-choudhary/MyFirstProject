package Threads;

class Yahho extends Thread {
	
//public Yahho( String value){
//	super(value);
//}

	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Yahho :: Good Morning");
		
		System.out.println("Yahho :: hi....");
		System.out.println("Yahho :: how are u");
	}

}
class Yahho2 extends Thread {
	
public Yahho2( String value){
	super(value);
}

	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Yahho2 :: Good Morning");
		System.out.println("Yahho2 :: hi!!!!");
	}

}

public class MyDesk {

	public static void main(String[] args) {
		System.out.println("MyDesk :: Good Morning >> 1");
		
		Thread myObject = new Yahho();
		//Yahho myObject = new Yahho();
		myObject.start();
		try {
		myObject.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Yahho2 myObject2 = new Yahho2("Thread b");
		myObject2.start();
		
		
		//System.out.println("MyDesk :: Good Morning >> 2");
	}
}

