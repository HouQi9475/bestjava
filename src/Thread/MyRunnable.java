package Thread;

public class MyRunnable implements Runnable {

	private int a;
	@Override
	public void run() {
       for(int i=0;i<10;i++){
    	   System.out.println(Thread.currentThread().getName()+":"+a);
    	   a++;
       }
	}
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		new Thread(mr,"张三").start();
		new Thread(mr,"李四").start();
	}

}
