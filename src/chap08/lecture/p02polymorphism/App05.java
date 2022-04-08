package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;


public class App05 {
	public static void main(String[] args) {
		Retriver dog = new Retriver();
		Helper helper = dog;
		Pet pet = dog;
		Animal animal = dog;
		
		helper.help();
		pet.roll();
		animal.cry();
	}
}
