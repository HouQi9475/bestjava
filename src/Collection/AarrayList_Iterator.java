package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AarrayList_Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("HAHAHAHA");
		// ��һ�ֱ�������ʹ��foreach����List
		for (String str : list) {
			System.out.println(str);
		}
		// �ڶ��ֱ������������Ϊ������ص����ݽ��б���
		String[] arrStr = new String[list.size()];
		list.toArray(arrStr);
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		 //�����ֱ��� ʹ�õ�����������ر���
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
