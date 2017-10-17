package Serialize;

import java.io.Serializable;

/**
 * ����һ��ʵ�����кŽӿڵ���
 * @author Administrator
 *
 */
public class Employee implements Serializable{
	private String name;
	private int age;
	private transient int num;  //���һ�����Բ��ǿ����л��ģ���������Ա���ע���Ķ��ݵ�
	
	
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
