package com.java.threads;

public class VisibilityProblem implements Runnable {

	private static volatile boolean isSkip;
	
	@Override
	public void run() {
		int i=0;
		System.out.println("isSkip:"+isSkip);
		while(!isSkip) {
			i++;
		}
		System.out.println("Thread Completed");
	}

	public static void main(String[] args) throws InterruptedException {
		VisibilityProblem vp = new VisibilityProblem();
		
		Thread t1 = new Thread(vp);
		t1.start();
		
		Thread.sleep(1000);
		isSkip = true;
		
		System.out.println("Main Comleted");

	}

}
