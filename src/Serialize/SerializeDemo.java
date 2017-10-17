package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ʵ����һ��Employee���󣬲����ö������л���һ���ļ���
 * 
 * @author Administrator
 *
 */
public class SerializeDemo {
	public static void main(String[] args) {
		// ʵ����һ������
		Employee e = new Employee();
		e.setName("Ramon");
		e.setAge(23);
		e.setNum(688);

		try {
			FileOutputStream fos = new FileOutputStream("resource/employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("out put success...");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
