package Threads;




class MyThrea extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
		System.out.println( Thread.currentThread().getId()+"Ritu" +i);
		try{
			Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	
	
		
	
}
}


public class Davis {

	public static void main(String[] args) {
		MyThrea class1=new MyThrea();
		class1.start();
		
		MyThrea class2=new MyThrea();
		class2.start();

	}

}
