package Thread;

public class MyThread extends Thread {
	private int a;
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+a);
			a++;
		}
	}
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		mt1.start();
		mt2.start();
	}
}
