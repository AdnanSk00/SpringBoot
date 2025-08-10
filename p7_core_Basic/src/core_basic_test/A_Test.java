package core_basic_test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import core_Basic.A;

public class A_Test {	// Dev site testing
	int a;
	int b;
	
	@BeforeEach			// Method
	void runsBeforeMothods() {
		a = 10; b = 5;	// advice > restrictions
	}
	
	@Test
	public void sumTest() {
		A obj = new A();
//		runsBeforeMothods();	// @BeforeEach
		int expRes = 15;
		int actRes = obj.sum(a, b);
		if(actRes == expRes) {
			System.out.println("sum passed");
		} else {
			System.out.println("sum failed");
		}
	}
	
	@Test
	public void subTest() {
		A obj = new A();
//		runsBeforeMothods();
		int expRes = 5;		
		int actRes = obj.subtract(a, b);
		if(actRes == expRes) {
			System.out.println("@@sub passed");
		} else {
			System.out.println("@@sub failed");
		}
	}
}
