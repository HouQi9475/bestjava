package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRReadline {
	public static void main(String[] args)throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		//���� end ��ֹͣ
		do{
			str=bf.readLine();
			System.out.println(str);
		}while(!str.equals("end"));
	}
}
