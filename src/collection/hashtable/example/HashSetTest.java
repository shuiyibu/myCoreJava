/**
 * 
 */
package collection.hashtable.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author langdylan
 *
 *         Mar 9, 2016 10:15:03 AM
 */
public class HashSetTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		HashSet<String> words = new HashSet<>();
		System.out.println("Input \"Alice in WonderLand\":");
		Scanner input = new Scanner(System.in);
		long totalTime = 0;

		while (input.hasNext())
		{
			String word = input.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;

			totalTime += callTime;
		}

		Iterator<String> iterator = words.iterator();
		for (int i = 0; i <= 20 && iterator.hasNext(); i++)
		{
			String word = iterator.next();
			System.out.println(word);
		}

		System.out.println(words.size() + " distinct words. " + totalTime + " millseconds.");

	}

}
