/**
 * 
 */
package multithread.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author langdylan
 *
 *         Mar 12, 2016 9:57:13 PM
 */
public class ThreadLocalTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		

		

		for(int i=0;i<1_000_000;i++){
			CallDate r=new CallDate();
			Thread t=new Thread(r);
			t.start();
		}
	}

}

class CallDate implements Runnable
{
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	


	@Override
	public void run()
	{
		
		System.out.println("--------"+Thread.currentThread()+"-------------");
		String timeStamp = format.format(new Date());
		System.out.println(timeStamp);
		try
		{
			Thread.sleep(1_000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
