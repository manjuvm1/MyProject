package innerClass;

public class OuterClass {

	class InnerClassA {
		
	public void OuterClassMethod() {
		System.out.println("InnerCassA - OuterClassMethod");
	}
}
}
class MainClass {
	public static void main(String[] args) {
		OuterClass.InnerClassA icA = new OuterClass().new InnerClassA();
		icA.OuterClassMethod();
	}		
}
