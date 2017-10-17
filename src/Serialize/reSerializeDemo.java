package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化 将上面生成的employee.ser反序列化
 * 
 * @author Administrator
 *
 */
public class reSerializeDemo {
	public static void main(String[] args) {
		Employee e = null;

		try {
			FileInputStream fis = new FileInputStream("resource/employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e = (Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Employee class not found..");
			e1.printStackTrace();
			return;
		} 
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}

}
