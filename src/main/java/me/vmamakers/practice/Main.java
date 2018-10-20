package me.vmamakers.practice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	public static void main(String[] args) {
		Injector guice = Guice.createInjector(new BindingsModule());
		PizzaStore pizzaStore = guice.getInstance(PizzaStore.class);
		
		pizzaStore.slogan();
		pizzaStore.brag();
		pizzaStore.name();
	}
}
