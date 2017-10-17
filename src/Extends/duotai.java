package Extends;

public class duotai {
	public static void main(String[] args) {
		show(new Cat2()); // �� Cat ������� show ����
		show(new Dog2()); // �� Dog ������� show ����
		Animal2 a = new Cat2(); // ����ת��
		a.eat(); // ���õ��� Cat �� eat
		Cat2 c = (Cat2) a; // ����ת��
		c.work(); // ���õ��� Cat �� work
	}

	public static void show(Animal2 a) {
		a.eat();
		// �����ж�
		if (a instanceof Cat2) { // è��������
			Cat2 c = (Cat2) a;
			c.work();
		} else if (a instanceof Dog2) { // ����������
			Dog2 c = (Dog2) a;
			c.work();
		}
	}
}

abstract class Animal2 {
	abstract void eat();
}

class Cat2 extends Animal2 {
	public void eat() {
		System.out.println("����");
	}

	public void work() {
		System.out.println("ץ����");
	}
}

class Dog2 extends Animal2 {
	public void eat() {
		System.out.println("�Թ�ͷ");
	}

	public void work() {
		System.out.println("����");
	}
}
