/**
 * 
 */
package main;

import java.util.stream.IntStream;

/**
 * @author akshay.kumar
 *
 */
public class IntStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fn1();
	}

	/**
	 * Printing cubes of numbers from 1 to 50
	 */
	private static void fn1() {
		IntStream.rangeClosed(1, 50)
		.forEach(i -> System.out.format("Cube of %d is %d.%n", i, i*i*i));
	}

}
