package regex;

import java.util.regex.Pattern;

/**
 * java.util.regex ����Ҫ�������������ࣺ 
 * Pattern �ࣺ pattern ������һ��������ʽ�ı����ʾ��Pattern
 * ��û�й������췽����Ҫ����һ�� Pattern ������������ȵ����乫����̬���뷽����������һ�� Pattern
 * ���󡣸÷�������һ��������ʽ��Ϊ���ĵ�һ�������� 
 * Matcher �ࣺ Matcher �����Ƕ������ַ������н��ͺ�ƥ����������档��Pattern
 * ��һ����Matcher Ҳû�й������췽��������Ҫ���� Pattern ����� matcher ���������һ�� Matcher ����
 * PatternSyntaxException�� PatternSyntaxException ��һ����ǿ���쳣�࣬����ʾһ��������ʽģʽ�е��﷨����
 * 
 * @author Administrator
 *
 */
public class regexDemo {
	public static void main(String[] args) {
		//�����ַ������Ƿ����java�������
		String str="hello,i like java,yoyo";
		String regex=".*java.*";
		boolean isMatcher = Pattern.matches(regex, str);
		System.out.println(isMatcher);
	}
}
