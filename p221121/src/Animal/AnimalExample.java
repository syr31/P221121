package Animal;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("1.---------------");

		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("2,----------------");

//		animalSound(new Dog());
//		animalSound(new Cat());
	}

	public static void main(Animal animal) { //(Animal animal) 받아주는
		animal.sound();
	}

}
