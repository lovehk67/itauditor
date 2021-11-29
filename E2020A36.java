class SingletonExam {
	private static int counter = 0;
	
	private static class Singleton {
		private static SingletonExam INSTANCE = new SingletonExam();
	}

	public static SingletonExam getInstance() {
		counter++;
		return Singleton.INSTANCE;
	}
	
	private SingletonExam() {
		counter++;
	}

	public void increaseCounter() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}
}

public class E2020A36 {
	public static void main(String[] args) {
		SingletonExam se = SingletonExam.getInstance(); // 2
		se.increaseCounter(); // 3
		se.increaseCounter(); // 4
		//System.out.println(se.getCounter());
		SingletonExam.getInstance().increaseCounter(); // 6
		SingletonExam.getInstance().increaseCounter(); // 8
		System.out.println(SingletonExam.getInstance().getCounter()); // 9
	}
}
