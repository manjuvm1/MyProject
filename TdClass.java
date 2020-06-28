package threadPractice;

public class TdClass extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

class TestThread {
	public static void main(String[] args) {
		TdClass td = new TdClass();
		td.start();
		System.out.println(td.getName());
	}
}