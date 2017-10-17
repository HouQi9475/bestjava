package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateDemo {
	public static void main(String[] args) {
		// Java中获取当前日期
		Date date = new Date();
		System.out.println(date.toString());
		/**
		 * Java使用以下三种方法来比较两个日期： 使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。 使用方法
		 * before()，after() 和 equals()。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new
		 * Date (99, 2, 18)) 返回true。 使用 compareTo() 方法，它是由 Comparable 接口定义的，Date
		 * 类实现了这个接口。
		 */
		//使用SimpleDateFormat格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		//HH 24小时制  hh 12小时制
		sdf = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("当前时间为: " + sdf.format(date));
		//使用Printf格式化日期
		// %tc的使用
		System.out.printf("全部的日期和时间信息: %tc%n", date);
		// %tF的使用,f区分大小写
		System.out.printf("f的使用,年-月-日格式: %tF%n", date);
		// %tD的使用
		System.out.printf("D的使用,年/月/日格式: %tD%n", date);
		//r的使用 
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
		//t的使用 
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
		//R的使用 
		System.out.printf("HH:MM格式（24时制）：%tR",date);
		//b的使用，月份简称 
		String str=String.format(Locale.US,"英文月份简称：%tb",date);
		System.out.println(str);
		System.out.printf("本地月份简称：%tb%n",date);
		//B的使用，月份全称 
		str=String.format(Locale.US,"英文月份全称：%tB",date);
		System.out.println(str);
		System.out.printf("本地月份全称：%tB%n",date);
		//a的使用，星期简称 
		str=String.format(Locale.US,"英文星期的简称：%ta",date);
		System.out.println(str);
		//A的使用，星期全称 
		System.out.printf("本地星期的简称：%tA%n",date);
		//C的使用，年前两位 
		System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);
		//y的使用，年后两位 
		System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
		//j的使用，一年的天数 
		System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
		//m的使用，月份 
		System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
		//d的使用，日（二位，不够补零） 
		System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
		//e的使用，日（一位不补零） 
		System.out.printf("月份的日（前面不补0）：%te",date);
	}
}
