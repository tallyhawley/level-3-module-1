package IntroToJUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class MoreAndMoreTests {

	private String multiply(int x, int y) {
		int ha = x * y;
		String haa = x + " x " + y + " = " + ha;
		return haa;
	}

	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	private boolean isPrime(int x) {
		boolean y = true;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				y = false;
			}
		}
		return y;
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	private boolean isSquare(int x) {
		boolean y = false;
		for (int i = 1; i <= x; i++) {
			if (i * i == x) {
				y = true;
			}
		}
		return y;
	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	private boolean isCube(int x) {
		boolean y = false;
		for (int i = 1; i <= x; i++) {
			if (i * i * i == x) {
				y = true;
			}
		}
		return y;
	}

	@Test
	public void CubeTest() {

		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

}
