/**
 * 
 */
package multithread.synch;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LJT
 *
 *         2016��3��11�� ����3:08:27
 */
public class Bank
{
	private double[] accounts;
	private Lock bankLock;
	private Condition sufficientFunds;

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
		bankLock = new ReentrantLock();
		sufficientFunds = bankLock.newCondition();
	}

	/**
	 * @param from
	 * @param to
	 * @param amount
	 */
	public void transfer(int from, int to, double amount) throws InterruptedException
	{
		bankLock.lock();
		try
		{
			while (accounts[from] < amount)
				sufficientFunds.await();

			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
			sufficientFunds.signalAll();

		}
		finally
		{
			bankLock.unlock();
		}

	}

	/**
	 * @return
	 */
	public double getTotalBalance()
	{
		bankLock.lock();
		try
		{
			double sum = 0;
			for (double d : accounts)
			{
				sum += d;
			}
			return sum;
		}
		finally
		{
			bankLock.unlock();
		}

	}

	public int size()
	{
		return accounts.length;
	}
}
