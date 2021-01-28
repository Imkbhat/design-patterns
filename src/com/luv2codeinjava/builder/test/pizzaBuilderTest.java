package com.luv2codeinjava.builder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.luv2codeinjava.builder.Crust;
import com.luv2codeinjava.builder.Pizza;
import com.luv2codeinjava.builder.PizzaBuilder;
import com.luv2codeinjava.builder.Size;
import com.luv2codeinjava.builder.Topping;

public class pizzaBuilderTest {
	
	@Test
	public void shouldBuildThinCrustChickenPizza() {
		 Pizza pizza = new PizzaBuilder().withCrust(Crust.THIN).withTopping(Topping.CHICKEN).withSize(Size.LARGE).build();
	        assertEquals(Topping.CHICKEN,pizza.getTopping());
	        assertEquals(Size.LARGE,pizza.getSize());
	        assertEquals(Crust.THIN,pizza.getCrust());
	        assertEquals(305.0,pizza.getTotalPrice(),0);
	}

}
