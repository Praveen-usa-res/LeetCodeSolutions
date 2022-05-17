package com.java.threads;

public class RaceCondition implements Runnable {

	private int count;
	private static volatile boolean isSkip = true;
	
	private int getCount() {
		return count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		RaceCondition rc = new RaceCondition();
		
		Thread t1 = new Thread(rc);
		t1.start();
		Thread t2 = new Thread(rc);  
		t2.start();

		Thread.sleep(5000);
		isSkip = false;
		
		t1.join();
		t2.join();
		
		System.out.println("Count:"+rc.getCount());

	}

	@Override
	public synchronized void run() {
		for(int i=0; i < 5; i++) {
			try {
				Thread.sleep(i * 100);
				System.out.println(isSkip);
				if(isSkip) count++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
