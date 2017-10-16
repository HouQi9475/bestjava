package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ���������˵�����ڶ�����д�뵼�µ���������
 * @author HouQi

 *
 */
public class fileStreamDemo2 {
	public static void main(String[] args) {
		File f = new File("test1.txt");
		try {
			//����FileOutputStream���ļ�������ʱ�Զ�����
			FileOutputStream fos = new FileOutputStream(f);
		    // ����OutputStreamWriter����,��������ָ������,Ĭ��Ϊ����ϵͳĬ�ϱ���,windows����gbk
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			//д�뵽������
			osw.append("��������");
			osw.append("/n/r");
			osw.append("English");
			//�ر�д����.ͬʱ��ѻ���������д���ļ�
			osw.close();
			//�ر������
			fos.close();
			
			//����FileInputStream����
			FileInputStream fis = new FileInputStream(f);
			
			//����inputStreamReader���󣬱�����д��ʱ��ͬ
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			
			StringBuffer sb = new StringBuffer();
			while(isr.ready()){
				sb.append((char)isr.read());// ת��char���뵽StringBuffer��
			}
			System.out.println(sb.toString());
			isr.close();
			fis.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
