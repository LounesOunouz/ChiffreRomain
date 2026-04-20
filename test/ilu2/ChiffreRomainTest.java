package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffreRomainTest {
	private ChiffreRomain cr;

	@BeforeEach
	void setUp() {
		 cr =new ChiffreRomain();
	}

	@Test
	void testIterationOne() {
		assertEquals("I", cr.toChiffresRomains(1));
	}

	
}
