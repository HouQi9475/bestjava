package Serialize;

import java.io.Serializable;

/**
 * 定义一个实现序列号接口的类
 * @author Administrator
 *
 */
public class Employee implements Serializable{
	private String name;
	private int age;
	private transient int num;  //如果一个属性不是可序列化的，则这个属性必须注明的短暂的
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, int num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}
