/**
 * 
 */
package model;

import java.io.DataOutputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LJT
 *
 *         2016年3月11日 下午3:08:27
 */
public class Bank
{
	private double[] accounts;
	private Lock bankLock = new ReentrantLock();

	/**
	 * @param n
	 * @param initialBalance
	 */
	public Bank(int n, double initialBalance)
	{
		accounts = new double[n];
		for (int i = 0; i < n; i++)
		{
			accounts[i] = initialBalance;
		}
	}

	/**
	 * @param from
	 * @param ro
	 * @param amount
	 */
	public void transfer(int from, int to, double amount)
	{
		bankLock.lock();
		try
		{
			if (accounts[from] < amount)
				return;

			System.err.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf("Total Balance: %10.2f%n", getTotalBalance());

		}
		finally
		{
			bankLock.unlock();
		}

	}

	public double getTotalBalance()
	{
		double sum = 0;
		for (double d : accounts)
		{
			sum += d;
		}
		return sum;
	}

	public int size()
	{
		return accounts.length;
	}
}
