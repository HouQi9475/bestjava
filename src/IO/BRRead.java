package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c;  //ȡֵ��������c�����
		System.out.println("����c��ź�ر�..");
		do{
			c=(char) br.read();
			System.out.println("��������:"+c);
		}while(c!='c');	
	}
}
