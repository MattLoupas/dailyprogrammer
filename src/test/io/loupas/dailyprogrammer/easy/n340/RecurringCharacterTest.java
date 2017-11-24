package io.loupas.dailyprogrammer.easy.n340;

import org.junit.Assert;
import org.junit.Test;

import io.loupas.dailyprogrammer.easy.n340.RecurringCharacter;

public class RecurringCharacterTest {
	@Test
	public void test1(){
		String input = "ABCDEBC";
		Assert.assertEquals(new Character('B'), RecurringCharacter.getRecurringCharacter(input).character);
		Assert.assertEquals(1, RecurringCharacter.getRecurringCharacter(input).index);
	}
	
	@Test
	public void test2(){
		String input = "IKEUNFUVFV";
		Assert.assertEquals(new Character('U'), RecurringCharacter.getRecurringCharacter(input).character);
		Assert.assertEquals(3, RecurringCharacter.getRecurringCharacter(input).index);
	}
	
	@Test
	public void test3(){
		String input = "PXLJOUDJVZGQHLBHGXIW";
		Assert.assertEquals(new Character('J'), RecurringCharacter.getRecurringCharacter(input).character);
		Assert.assertEquals(3, RecurringCharacter.getRecurringCharacter(input).index);
	}
	
	@Test
	public void test4(){
		String input = "*l1J?)yn%R[}9~1\"=k7]9;0[$";
		Assert.assertEquals(new Character('1'), RecurringCharacter.getRecurringCharacter(input).character);
		Assert.assertEquals(2, RecurringCharacter.getRecurringCharacter(input).index);
	}
}
