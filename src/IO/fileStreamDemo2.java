package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 解决上面所说的由于二进制写入导致的乱码问题
 * @author HouQi

 *
 */
public class fileStreamDemo2 {
	public static void main(String[] args) {
		File f = new File("test1.txt");
		try {
			//构建FileOutputStream，文件不存在时自动创建
			FileOutputStream fos = new FileOutputStream(f);
		    // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			//写入到缓冲区
			osw.append("中文输入");
			osw.append("/n/r");
			osw.append("English");
			//关闭写入流.同时会把缓冲区内容写入文件
			osw.close();
			//关闭输出流
			fos.close();
			
			//构建FileInputStream对象
			FileInputStream fis = new FileInputStream(f);
			
			//构建inputStreamReader对象，编码与写入时相同
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			
			StringBuffer sb = new StringBuffer();
			while(isr.ready()){
				sb.append((char)isr.read());// 转成char加入到StringBuffer中
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
