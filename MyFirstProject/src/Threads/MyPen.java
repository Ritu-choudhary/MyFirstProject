package Threads;



class Yahhoo1 extends Thread {

	
	public synchronized  void getdata() {
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(  Thread.currentThread() +"::"+ i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void run()
	{
		getdata();
	}
}

public class MyPen {

	public static void main(String[] args) {
		Yahhoo1 myObject1 = new Yahhoo1();
		myObject1.setName("Thread R");
		myObject1.start();
/*try {
	myObject1.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}*/
		Yahhoo1 myObject2 = new Yahhoo1();
		myObject2.setName("Thread D");
		myObject2.start();
		/*try {
			myObject2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
