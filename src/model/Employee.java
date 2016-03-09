/**
 * 
 */
package model;

/**
 * @author langdylan
 *
 *         Mar 9, 2016 2:28:34 PM
 */
public class Employee
{
	private String name;

	
	
	/**
	 * @param name
	 */
	public Employee(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return this.name;
	}
}
