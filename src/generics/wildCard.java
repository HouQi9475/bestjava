package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符 一般使用？代替具体的类型参数
 * 
 * @author HouQi
 *
 * 
 */
public class wildCard {
	public static void getData(List<?> list) {
		System.out.println("data:" + list.get(0));
	}
	public static void getNumber(List<? extends Number> list){
		System.out.println("numberData:"+list.get(0));
	}
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();
        
        name.add("leo");
        age.add(23);
        number.add(3160);
        
        getData(name);
        getData(age);
        getData(number);
        
        getNumber(age);
        getNumber(number);
	}
}
