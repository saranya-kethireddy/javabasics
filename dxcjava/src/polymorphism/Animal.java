package polymorphism;

public class Animal {
  void eat() {
	  System.out.println("animal is created");
  }
}
  class Dog extends Animal {
	 
		 void eat(){
		  System.out.println("dog is creAted");
	  }
	  public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		
	}
  }

