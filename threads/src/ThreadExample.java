
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
		NumberThread t1 = new NumberThread(1, 400);
		NumberThread t2 = new NumberThread(800, 1400);
		//t2.setDaemon(true);
		t1.start();
		t2.start();
		
//		Thread t3 = new Thread(() ->  {
//			while(true) {
//				System.out.println("Hello!!!");
//			}
//		});
//		t3.setDaemon(true);
		
		doTask();
		System.out.println("Main Dies!!!");
	}

	private static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name : " + t.getName());
		System.out.println("Group : "+ t.getThreadGroup().getName());
		System.out.println("Priority : "+t.getPriority());
		
		/*
		 * JRE checks the status of only Non-Daemon threads before it terminates
		 */
		System.out.println("Daemon : "+t.isDaemon());
	}

}
