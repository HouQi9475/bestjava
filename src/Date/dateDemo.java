package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateDemo {
	public static void main(String[] args) {
		// Java�л�ȡ��ǰ����
		Date date = new Date();
		System.out.println(date.toString());
		/**
		 * Javaʹ���������ַ������Ƚ��������ڣ� ʹ�� getTime() ������ȡ�������ڣ���1970��1��1�վ����ĺ�����ֵ����Ȼ��Ƚ�������ֵ�� ʹ�÷���
		 * before()��after() �� equals()�����磬һ���µ�12�ű�18���磬�� new Date(99, 2, 12).before(new
		 * Date (99, 2, 18)) ����true�� ʹ�� compareTo() ������������ Comparable �ӿڶ���ģ�Date
		 * ��ʵ��������ӿڡ�
		 */
		//ʹ��SimpleDateFormat��ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		//HH 24Сʱ��  hh 12Сʱ��
		sdf = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("��ǰʱ��Ϊ: " + sdf.format(date));
		//ʹ��Printf��ʽ������
		// %tc��ʹ��
		System.out.printf("ȫ�������ں�ʱ����Ϣ: %tc%n", date);
		// %tF��ʹ��,f���ִ�Сд
		System.out.printf("f��ʹ��,��-��-�ո�ʽ: %tF%n", date);
		// %tD��ʹ��
		System.out.printf("D��ʹ��,��/��/�ո�ʽ: %tD%n", date);
		//r��ʹ�� 
		System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);
		//t��ʹ�� 
		System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);
		//R��ʹ�� 
		System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",date);
		//b��ʹ�ã��·ݼ�� 
		String str=String.format(Locale.US,"Ӣ���·ݼ�ƣ�%tb",date);
		System.out.println(str);
		System.out.printf("�����·ݼ�ƣ�%tb%n",date);
		//B��ʹ�ã��·�ȫ�� 
		str=String.format(Locale.US,"Ӣ���·�ȫ�ƣ�%tB",date);
		System.out.println(str);
		System.out.printf("�����·�ȫ�ƣ�%tB%n",date);
		//a��ʹ�ã����ڼ�� 
		str=String.format(Locale.US,"Ӣ�����ڵļ�ƣ�%ta",date);
		System.out.println(str);
		//A��ʹ�ã�����ȫ�� 
		System.out.printf("�������ڵļ�ƣ�%tA%n",date);
		//C��ʹ�ã���ǰ��λ 
		System.out.printf("���ǰ��λ���֣�������λǰ�油0����%tC%n",date);
		//y��ʹ�ã������λ 
		System.out.printf("��ĺ���λ���֣�������λǰ�油0����%ty%n",date);
		//j��ʹ�ã�һ������� 
		System.out.printf("һ���е�����������ĵڼ��죩��%tj%n",date);
		//m��ʹ�ã��·� 
		System.out.printf("��λ���ֵ��·ݣ�������λǰ�油0����%tm%n",date);
		//d��ʹ�ã��գ���λ���������㣩 
		System.out.printf("��λ���ֵ��գ�������λǰ�油0����%td%n",date);
		//e��ʹ�ã��գ�һλ�����㣩 
		System.out.printf("�·ݵ��գ�ǰ�治��0����%te",date);
	}
}
