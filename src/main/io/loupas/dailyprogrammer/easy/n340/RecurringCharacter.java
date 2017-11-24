package io.loupas.dailyprogrammer.easy.n340;

import java.util.HashMap;

public class RecurringCharacter {
	
	public Character character;
	public int index;
	
	public static RecurringCharacter getRecurringCharacter(String input){
		return new RecurringCharacter(input);
	}
	
	public RecurringCharacter(String input){
		this.findRecurringCharacter(input);
	}
	
	private void findRecurringCharacter(String input){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int index = 0;
		for(char c:input.toCharArray()){
			if(map.containsKey(c)){
				this.character = c;
				this.index = map.get(c);
				return;
			} else {
				map.put(c, index++);
			}
		}
	}
}
