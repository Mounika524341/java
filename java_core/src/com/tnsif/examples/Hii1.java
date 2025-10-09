package com.tnsif.examples;


public class Hii1 {

	public static void main(String[] args) {
		Hii h = (int i) ->
				{
					System.out.println("hii class" +i);
					return i;
				};
				
				h.show(6);
	}

}
