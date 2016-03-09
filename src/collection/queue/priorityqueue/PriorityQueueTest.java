/**
 * 
 */
package collection.queue.priorityqueue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * @author langdylan
 *
 *         Mar 9, 2016 12:18:31 PM
 */
public class PriorityQueueTest
{
	public static void main(String[] args)
	{
		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
		pq.add(new GregorianCalendar(1960, Calendar.DECEMBER, 9));
		pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10));
		pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3));
		pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22));

		System.out.println("Iterator elements...");

		for (GregorianCalendar gregorianCalendar : pq)
		{
			System.out.println(gregorianCalendar.get(Calendar.YEAR));
		}
		System.out.println("---------------");
		while(!pq.isEmpty()){
			System.out.println(pq.remove().get(Calendar.YEAR));
		}
	}
}
