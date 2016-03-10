/**
 * 
 */
package collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author langdylan
 *
 *         Mar 10, 2016 10:23:20 AM
 */
public class FrameworkTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String[] names = new String[20];
		List<String> nameList=Arrays.asList(names);
//		nameList.add("Felix");
		
		List<String> list=Collections.nCopies(100, "default");
		for (String string : list)
		{
			System.out.println(string);
		}
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Carl");
		list2.add("Bounge");
		list2.add("Miller");
		list2.add("Carl");
		
		Set<ArrayList<String>> set=Collections.singleton(list2);
		for (ArrayList<String> string : set)
		{
			System.out.println(string);
		}
		
		
		
		
		
	}

}
