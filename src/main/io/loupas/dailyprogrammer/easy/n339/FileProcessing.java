package io.loupas.dailyprogrammer.easy.n339;

import java.util.ArrayList;

public class FileProcessing {
	public static String highestSalary(String input){
		int currentHighSalary = 0;
		String name = null;
		String currentName = null;
		for(String line:input.split("\n")){
			if(isSalExtension(line)){
				int salary = new Integer(line.substring(11));
				if(salary > currentHighSalary){
					currentHighSalary = salary;
					name = currentName;
				}
			} else if (!isExtension(line)){
				currentName = line.substring(0, 20).trim();
			}
		}
		return name + ", " + formatCurrency(currentHighSalary);
	}

	private static String formatCurrency(int currentHighSalary) {
		String salary = "" + currentHighSalary;
		ArrayList<String> list = new ArrayList<String>();
		while(salary.length() > 3){
			list.add(0, salary.substring(salary.length() - 3));
			salary = salary.substring(0, salary.length() - 3);
		}
		list.add(0, salary);
		return "$" + String.join(",", list);
	}

	private static boolean isExtension(String line) {
		return "::EXT::".equals(line.substring(0, 7));
	}

	private static boolean isSalExtension(String line) {
		return "::EXT::SAL ".equals(line.substring(0, 11));
	}
}
