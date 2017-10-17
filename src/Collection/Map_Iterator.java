package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> user = new HashMap<String, Integer>();
		user.put("leo", 23);
		user.put("ramon", 32);
		user.put("chleo", 22);
		// ��һ�֣��ձ�ʹ�ã�����ȡֵ
		System.out.println("ͨ��Map.keySet����key��value��");
		for (String key : user.keySet()) {
			System.out.println(key + ":" + user.get(key));
		}
		// �ڶ���
		System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
		Iterator<Map.Entry<String, Integer>> it = user.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key:" + entry.getKey() + ",value=" + entry.getValue());
		}
		// �����֣��Ƽ���������������ʱ
		System.out.println("ͨ��Map.entrySet����key��value");
		for (Map.Entry<String, Integer> entry : user.entrySet()) {
			System.out.println("key:" + entry.getKey() + ",value=" + entry.getValue());
		}
		// ������
		System.out.println("ͨ��Map.values()�������е�value�������ܱ���key");
		for(Integer value:user.values()) {
			System.out.println("value="+value);
		}
	}
}
