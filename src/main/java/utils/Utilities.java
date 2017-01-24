/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author akshay.kumar
 *
 */
public final class Utilities {

	private Utilities() {}
	
	public static List<String> getStringList() {
		List<String> list = new ArrayList<String>();
		list.add("Akshay");
		list.add("Pratibha");
		list.add("Shubham");
		list.add("Nishant");
		list.add("Spider");
		list.add("Naman");
		list.add("Rakesh");
		return list;
	}
	
	public static List<Integer> getIntList() {
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int random = rand.nextInt(100) + 1;
			list.add(random);
		}
		return list;
	}
}
