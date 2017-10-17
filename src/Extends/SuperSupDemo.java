package Extends;
/**
 * 静态方法中不能使用 super 关键字
 * @author Administrator
 *
 */
public class SuperSupDemo {
	public static void main(String[] args) {
		SubClass s1 = new SubClass();
		SubClass s2 = new SubClass(188);
	}
}

class SuperClass {
	private int n;

	public SuperClass(int n) {
		this.n = n;
		System.out.println("SuperClass(int n)");
	}

	public SuperClass() {
		System.out.println("SuperClass()");
	}
}

class SubClass extends SuperClass {
	private int n;

	public SubClass() {
		super(200);
		System.out.println("SubClass()");
	}

	public SubClass(int n) {
		this.n = n;
		System.out.println("SubClass(int n)");
	}
}
