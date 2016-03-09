/**
 * 
 */
package collection.linkedlist.examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author langdylan
 *
 *         Mar 7, 2016 9:20:54 PM
 */
public class LinkedListTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");

		List<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");

		// merge words from b to a
		ListIterator<String> aIterator = a.listIterator();
		Iterator<String> bIterator = b.iterator();

		while (bIterator.hasNext())
		{
			if (aIterator.hasNext())
				aIterator.next();
			aIterator.add(bIterator.next());
		}
		System.out.println(a);

	}

}
