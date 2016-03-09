/**
 * 
 */
package collection.comparable;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * @author langdylan
 *
 *         Mar 9, 2016 11:00:03 AM
 * @param <T>
 */
public class Item implements Comparable<Item>
{
	private int		partNumber;
	private String	description;

	@Override
	public int compareTo(Item other)
	{
		// TODO Auto-generated method stub
		if (Integer.MIN_VALUE > (partNumber - other.partNumber))
			return -1;
		if (Integer.MAX_VALUE < (partNumber - other.partNumber))
			return 1;

		return partNumber - other.partNumber;
	}

	/**
	 * @return the partNumber
	 */
	public int getPartNumber()
	{
		return partNumber;
	}

	/**
	 * @param partNumber
	 *            the partNumber to set
	 */
	public void setPartNumber(int partNumber)
	{
		this.partNumber = partNumber;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	public static void main(String[] args)
	{
		ItemComparator comp = new ItemComparator();
		SortedSet<Item> sortByDesc = new TreeSet<Item>(comp);
		SortedSet<Item> sortByDesc2 = new TreeSet<Item>(new Comparator<Item>()
			{
				@Override
				public int compare(Item item, Item item2)
				{
					String description = item.getDescription();
					String description2 = item2.getDescription();

					return description.compareTo(description2);
				}
			});
	}
}

class ItemComparator implements Comparator<Item>
{

	@Override
	public int compare(Item item, Item item2)
	{

		String description = item.getDescription();
		String description2 = item2.getDescription();

		return description.compareTo(description2);
	}
}