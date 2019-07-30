package com.visa.prj.client;

@FunctionalInterface    //only one method needs to be implemented
interface Computation{
	int compute(int x,int y);
}



public class FunctionalExample {

	public static void main(String[] args) {
		Computation c1 = new Computation() {
			
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		
		doTask(c1,4,5);
		
		Computation c2 = new Computation() {
			
			@Override
			public int compute(int x, int y) {
				return x - y;
			}
		};
		
		doTask(c2,4,5);
	
		// Lambda is a short form for anonymous class --> if interface has 1 method
		Computation c3 = (int x,int y) -> {
			return x*y;
		};
		doTask(c3,4,5);
		
		Computation c4 = (x,y) -> {
			return x*y;
		};
		doTask(c4,5,5);
		
		Computation c5 = (x,y) -> x*y;
		doTask(c5,8,5);
	}

	private static void doTask(Computation c,int x, int y) {
		System.out.println(c.compute(x, y));
	}

}
