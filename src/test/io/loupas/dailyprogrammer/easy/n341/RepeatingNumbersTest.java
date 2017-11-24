package io.loupas.dailyprogrammer.easy.n341;

import org.junit.Assert;
import org.junit.Test;

public class RepeatingNumbersTest {
	@Test
	public void test1() {
		Assert.assertEquals(
				"8215682:2 821568:2 215682:2 82156:2 21568:2 15682:2 8215:2 2156:2 1568:2 5682:2 821:2 215:2 156:2 568:2 682:2 82:3 21:3 15:2 56:2 68:2",
				RepeatingNumbers.findRepeatingNumbers("82156821568221"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(
				"11110111:2 1111011:2 1110111:2 111101:2 111011:3 110111:2 11110:2 11101:3 11011:3 10111:2 1111:3 1110:3 1101:3 1011:3 0111:2 111:6 110:3 101:3 011:3 11:10 10:3 01:3",
				RepeatingNumbers.findRepeatingNumbers("11111011110111011"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(
				"0",
				RepeatingNumbers.findRepeatingNumbers("98778912332145"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(
				"44899:2 4489:2 4899:2 448:2 489:2 899:2 44:3 48:2 89:2 99:2",
				RepeatingNumbers.findRepeatingNumbers("124489903108444899"));
	}
}
