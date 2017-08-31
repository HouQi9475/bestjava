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
				System.out.println(Thread.currentThread().getName()+":剩余"+tickets--+"张票!");
			}
		}
		return "没票了！";
	}
    public static void main(String[] args) {
    	Callable<String> ca=new MyCallable();
    	//取得执行结果
    	FutureTask<String> ft=new FutureTask<>(ca);  //取得执行结果
    	Thread thread=new Thread(ft);
    	thread.start();
    	try {
			System.out.println(ft.get());  //获取主线程返回值
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
