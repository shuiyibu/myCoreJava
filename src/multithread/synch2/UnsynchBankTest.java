package multithread.synch2;

/**
 * @author LJT
 *
 *         2016��3��11�� ����3:05:45
 */
public class UnsynchBankTest
{
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;

	public static void main(String[] args)
	{
		Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

		for (int i = 0; i < NACCOUNTS; i++)
		{
			TransferRunnable r = new TransferRunnable(bank, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}
