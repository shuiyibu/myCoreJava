/**
 * 
 */
package multithread.unsynch;

import model.Bank;

/**
 * @author LJT
 *
 *         2016年3月11日 下午3:19:34
 */
public class TransferRunnable implements Runnable
{
	private Bank bank;
	private int fromAccount;
	private double maxAccount;
	private final int DELAY = 10;

	public TransferRunnable(Bank bank, int fromAccount, double maxAccount)
	{
		super();
		this.bank = bank;
		this.fromAccount = fromAccount;
		this.maxAccount = maxAccount;
	}

	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				int toAccount = (int) (bank.size() * Math.random());
				double amount = maxAccount * Math.random();
				bank.transfer(fromAccount, toAccount, amount);
				Thread.sleep((int) (DELAY * Math.random()));
			}
		}
		catch (InterruptedException e)
		{
			// TODO: handle exception
		}

	}

}
