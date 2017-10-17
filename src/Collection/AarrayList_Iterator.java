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
		// 第一种遍历方法使用foreach遍历List
		for (String str : list) {
			System.out.println(str);
		}
		// 第二种遍历，把链表变为数组相关的内容进行遍历
		String[] arrStr = new String[list.size()];
		list.toArray(arrStr);
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		 //第三种遍历 使用迭代器进行相关遍历
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
