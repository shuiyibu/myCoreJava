/**
 * 
 */
package collection.queue;

/**
 * @author langdylan
 *
 *         Mar 7, 2016 7:28:30 PM
 */
public interface Queue<E>
{
	void add(E element);

	E remove();

	int size();
}
