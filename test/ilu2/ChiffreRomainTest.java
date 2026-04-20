package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffreRomainTest {
	private ChiffreRomain cr;

	@BeforeEach
	void setUp() {
		cr = new ChiffreRomain();
	}

	@Test
	void testIterationOne() {
		assertEquals("I", cr.toChiffresRomains(1));
	}

	@Test
	void testIterationTwo() {
		assertEquals("II", cr.toChiffresRomains(2));
		assertEquals("III", cr.toChiffresRomains(3));
	}

	@Test
	void testIterationThree() {
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(-1));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(4000));
	}

	@Test
	void testIterationFour() {
		assertEquals("IV", cr.toChiffresRomains(4));
	}

}
