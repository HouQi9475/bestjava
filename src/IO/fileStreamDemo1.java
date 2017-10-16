package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 内容有二进制写入，会出现乱码。
 * @author HouQi

 *
 */
public class fileStreamDemo1 {
	public static void main(String[] args) {
		byte[] bWrite={23,24,3,1,6};
		try {
			OutputStream os = new FileOutputStream("test.txt");
			for(int i=0;i<bWrite.length;i++){
				os.write(bWrite[i]);
			}
			os.close();
			InputStream is=new FileInputStream("test.txt");
			int size=is.available();
			for(int i=0;i<size;i++){
				System.out.println((char)is.read()+" ");
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
