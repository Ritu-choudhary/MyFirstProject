package Threads;



class Yahhoo2 implements Runnable {

	public  void run() {
		 try{
				Thread.sleep(6000);
		 } catch (InterruptedException e) {
				e.printStackTrace();
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread() + " :: " + i);
				
			}
			
		
		}
	}
}

public class MyThr {

	public static void main(String[] args) {
		Thread myObject1 = new Thread(new Yahhoo());
		
		
		myObject1.setName("Thread-A");
		myObject1.start();
		
          

		Thread myObject2 = new Thread(new Yahhoo());
		myObject2.setName("Thread-B");
		myObject2.start();
		
		 System.out.println("Ritu");
	}
}
