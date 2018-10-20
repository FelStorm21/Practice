package me.vmamakers.practice;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class PizzaStore {
	
	private final Pizza pizza;
	private final Provider<Building> buildingProvider;
	@Inject private Company company;
	
	@Inject
	public PizzaStore(Pizza pizza, Provider<Building> buildingProvider) {
		this.pizza = pizza;
		this.buildingProvider = buildingProvider;
	}
	
	public void slogan() {
		System.out.println("We make the best " + pizza.getType() + " pizzas!");
	}
	
	public void brag() {
		System.out.println("We can pump out " + buildingProvider.get().getNumPizzas() + " pizzas every week!");
	}
	
	public void name() {
		System.out.println("We are " + company.getName() + "!");
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public Provider<Building> getBuildingProvider() {
		return buildingProvider;
	}
	
}
