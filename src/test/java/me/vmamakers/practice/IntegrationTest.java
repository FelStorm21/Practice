package me.vmamakers.practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class IntegrationTest {
    
	PizzaStore testStore;
	
	@BeforeMethod
	public void setUp() {
		Injector testGuice = Guice.createInjector(new BindingsModule());
		testStore = testGuice.getInstance(PizzaStore.class);
		/*
		 * BINDINGS - 
		 * Pizza - VeggiePizza
		 * Building - BuildingProvider - TwoStoryBuilding
		 * Company - PapaJohnsPizzaCompany
		 */
	}
	
    @Test
    public void testPizzaType() {
    	Assert.assertEquals(testStore.getPizza().getType(), "Veggie");
    }
    
    @Test
    public void testBuildingSize() {
        Assert.assertEquals(testStore.getBuildingProvider().get().getNumPizzas(), 10000);
    }
    
    @Test
    public void testCompanyName() {
        Assert.assertEquals(testStore.getCompany().getName(), "Papa John's");
    }
    
    @AfterMethod
    public void tearDown() {
    	testStore = null;
    }
    
}
