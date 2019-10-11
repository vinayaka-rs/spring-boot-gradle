package org.baeldung.implsTest;

import static org.junit.Assert.assertTrue;

import org.baeldung.impls.SampleImpl;
import org.junit.Test;

public class SampleImplTest {

	private SampleImpl sample = new SampleImpl();
	
	@Test
	public void printDataTest() {
		sample.printData();
		assertTrue(true);
	}
	
	@Test
	public void saveDataTest() {
		sample.saveData();
	}
}
