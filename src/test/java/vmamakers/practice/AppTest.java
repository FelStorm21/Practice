package vmamakers.practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
    
	@BeforeMethod
	public void setUp() {
		
	}
	
    @Test
    public void shouldAnswerWithTrue() {
        Assert.assertTrue(true);
    }
    
    @AfterMethod
    public void tearDown() {
    	
    }
    
}
