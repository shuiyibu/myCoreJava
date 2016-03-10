/**
 * 
 */
package collection.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import model.Employee;

/**
 * @author langdylan
 *
 *         Mar 9, 2016 6:24:23 PM
 */
public class LinkedHashMapTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Map<String, Employee> staff = new LinkedHashMap<>();

		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));

		staff.get("567-24-2546");
		staff.get("567-24-2546");
		staff.get("567-24-2546");
		
		Set<String> keys = staff.keySet();
		for (String key : keys)
		{
			System.out.println(key);
		}
		System.out.println(staff);

		staff.remove("567-24-2546");

		staff.put("456-62-5527", new Employee("Francesca Miller"));

		System.out.println(staff.get("157-62-7935"));

		for (Map.Entry<String, Employee> entry : staff.entrySet())
		{
			String key = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println("key:" + key + ", value:" + employee.toString());
		}

	}

}
