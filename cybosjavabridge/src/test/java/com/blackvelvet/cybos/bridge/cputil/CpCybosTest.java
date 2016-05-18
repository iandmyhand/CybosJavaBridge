package com.blackvelvet.cybos.bridge.cputil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CpCybosTest {
	
	ICpCybos cpCybos;

	@Before
	public void setUp() throws Exception {
		cpCybos = ClassFactory.createCpCybos();
	}

	@Test
	public void testIsConnect() {
		assertEquals(1, cpCybos.isConnect());
	}

}
