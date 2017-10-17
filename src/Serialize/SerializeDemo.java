package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 实例化一个Employee对象，并将该对象序列化到一个文件中
 * 
 * @author Administrator
 *
 */
public class SerializeDemo {
	public static void main(String[] args) {
		// 实例化一个对象
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
