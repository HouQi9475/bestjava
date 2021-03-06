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
		// 第一种：普遍使用，二次取值
		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : user.keySet()) {
			System.out.println(key + ":" + user.get(key));
		}
		// 第二种
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, Integer>> it = user.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key:" + entry.getKey() + ",value=" + entry.getValue());
		}
		// 第三种：推荐，尤其是容量大时
		System.out.println("通过Map.entrySet遍历key和value");
		for (Map.Entry<String, Integer> entry : user.entrySet()) {
			System.out.println("key:" + entry.getKey() + ",value=" + entry.getValue());
		}
		// 第四种
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		for(Integer value:user.values()) {
			System.out.println("value="+value);
		}
	}
}
