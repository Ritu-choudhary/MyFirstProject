package Threads;



class Share {
	public synchronized void getData(String threadName) {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " :: " + i);
		}
	}
}

class MyT extends Thread {
	private Share share;

	public MyT(Share share, String pThreadName) {
		super(pThreadName);
		this.share = share;
	}

	public void run() {
		share.getData(Thread.currentThread().getName());
	}
}

public class MyDav{

	public static void main(String[] args) {
		Share shareObject = new Share();
		MyT obj1 = new MyT(shareObject ,"Thread-A");
		obj1.start();

		MyT obj2 = new MyT(shareObject, "Thread-B");
		obj2.start();
	}
}
