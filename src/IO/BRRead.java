package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c;  //取值。当输入c后结束
		System.out.println("输入c后才后关闭..");
		do{
			c=(char) br.read();
			System.out.println("您输入了:"+c);
		}while(c!='c');	
	}
}
