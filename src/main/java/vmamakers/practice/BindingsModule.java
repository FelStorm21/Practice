package vmamakers.practice;

import com.google.inject.AbstractModule;

public class BindingsModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(Pizza.class).to(VeggiePizza.class);
		bind(Building.class).toProvider(BuildingProvider.class);
	}
	
}
