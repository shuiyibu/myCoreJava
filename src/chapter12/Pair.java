/**
 * 
 */
package chapter12;

/**
 * @version 2015-11-03
 * @author Dylan
 *
 */
public class Pair<T> {
	private T first;
	private T second;
	
	
	public Pair() {
		super();
		this.first=null;
		this.second=null;
	}


	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}


	public T getFirst() {
		return first;
	}


	public void setFirst(T first) {
		this.first = first;
	}


	public T getSecond() {
		return second;
	}


	public void setSecond(T second) {
		this.second = second;
	}
	
	

}


