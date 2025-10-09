package com.tnsif.examples;


public class RunLamda {

	public static void main(String[] args) {
	Runnable runs = ()->
	{
		String sthread = Thread.currentThread().getName();
		System.out.println(sthread);
	};
	Thread t1 = new Thread(runs);
	t1.start();

	}

}