package io.loupas.dailyprogrammer.easy.n341;

import java.util.LinkedHashMap;

public class RepeatingNumbers {
	public static String findRepeatingNumbers(String input){
		LinkedHashMap<String, Integer> map = buildMap(input);
		String result = buildString(map);
		return "".equals(result) ? "0":result;
	}

	private static LinkedHashMap<String, Integer> buildMap(String input) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i = input.length(); i > 1; i--){
			for(int k = 0; k <= input.length() - i; k++){
				String key = input.substring(k, k+i);
				if(map.containsKey(key)){
					map.put(key, map.get(key) + 1);
				} else {
					map.put(key, 1);
				}
			}
		}
		return map;
	}

	private static String buildString(LinkedHashMap<String, Integer> map) {
		StringBuilder builder = new StringBuilder();
		map.forEach((k,v)->{
			if(v > 1){
				builder.append(k).append(":").append(v).append(" ");
			}
		});
		
		String result = builder.toString().trim();
		return result;
	}
}
