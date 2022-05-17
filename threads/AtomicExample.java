package com.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample implements Runnable {

	private AtomicInteger count = new AtomicInteger();
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(i * 100);
				count.getAndIncrement();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		AtomicExample ae = new AtomicExample();
		
		Thread t1 = new Thread(ae);
		t1.start();
		
		Thread t2 = new Thread(ae);
		t2.start();
		
		t1.join();t2.join();
		System.out.println("Count:"+ae.getCount());
		

	}
	
	private int getCount() {
		return count.get();
	}

}
