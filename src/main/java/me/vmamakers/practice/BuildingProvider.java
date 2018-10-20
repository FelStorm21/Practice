package me.vmamakers.practice;

import com.google.inject.Provider;

public class BuildingProvider implements Provider<Building> {

	@Override 
	public Building get() {
		return new TwoStoryBuilding();
	}

}
