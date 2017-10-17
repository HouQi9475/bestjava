package Extends;

public class animalDemo {
	public static void main(String[] args) {
		dog dog=new dog("wangcai", "yellow");
		cat cat=new cat("tom", "blue");
		dog.eat();
		dog.show();
		dog.talk();
		dog.together();
		
		cat.eat();
		cat.show();
		cat.speak();
	}
}
