package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String> {

	private int tickets=5;
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++){
			if(tickets>0){
				System.out.println(Thread.currentThread().getName()+":ʣ��"+tickets--+"��Ʊ!");
			}
		}
		return "ûƱ�ˣ�";
	}
    public static void main(String[] args) {
    	Callable<String> ca=new MyCallable();
    	//ȡ��ִ�н��
    	FutureTask<String> ft=new FutureTask<>(ca);  //ȡ��ִ�н��
    	Thread thread=new Thread(ft);
    	thread.start();
    	try {
			System.out.println(ft.get());  //��ȡ���̷߳���ֵ
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
