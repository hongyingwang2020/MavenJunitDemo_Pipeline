package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App ap = new App();
	    int	output = ap.squareMaven(5);
	    assertEquals(25, output);
		
	}

}
