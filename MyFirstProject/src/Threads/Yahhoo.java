package Threads;


public class Yahhoo implements Runnable  {
public void run(){
	try{
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread()+"::"+i);
		Thread.sleep(5000);
		}
	}catch(InterruptedException e){
		System.out.println("InterruptedException"+e);
		e.printStackTrace();
	}
}

}
