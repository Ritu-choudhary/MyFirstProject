package Threads;



class MyThread extends Thread{
public  MyThread(String value)
{
	super (value);
}
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println(Thread.currentThread().getId()+ "Ritu" +i);
		
		try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	
	
		
	
}
	
	}



public class MyName {

	public static void main(String[] args) {
		MyThread class1=new MyThread("Thread A");
		
		class1.start();
		
		MyThread class2=new MyThread("Thread B");
		
		class2.start();

	}

}
