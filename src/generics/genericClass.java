package generics;

/**
 * 定义一个泛型类
 * 
 * @author HouQi
 *
 * 
 */
public class genericClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		genericClass<Integer> integer = new genericClass<Integer>();
		genericClass<String> str = new genericClass<String>();
		integer.setT(518);
		str.setT("wife");
		System.out.println(integer.getT());
		System.out.println(str.getT());
	}

}
