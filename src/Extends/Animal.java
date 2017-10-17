package Extends;
/**
 * 定义一个动物父类
 * @author Administrator
 *
 */
public class Animal {
	private String name;
	private String color;
	
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("i am father..");
	}
	
	public void eat() {
		System.out.println(name+" eat");
	}
	public void show() {
		System.out.println("color is "+color);
	}
	
	public void sing() {
		System.out.println("father singing...");
	}
}
