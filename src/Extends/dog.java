package Extends;

public class dog extends Animal {

	public dog(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public void talk() {
		System.out.println("i am dog");
	}
	public void sing() {
		System.out.println("son singing...");
	}
	public void together() {
		this.sing();   //�Լ�����
		super.sing();  //���೪��,ͨ��super���ø���ķ���
	}
	
}
