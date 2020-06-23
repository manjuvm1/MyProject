package EnumClass;

enum Weeks {
	MON, TUE, WED, THU, FRI, SAT, SUN
}
public class WeeksEnum {

	public static void main(String[] args) {
		Weeks w = Weeks.FRI;
		System.out.println(w);
		
		switch(w) {
			case FRI : System.out.println("Friday");
						break;
			default : System.out.println("Not valid week");
						break;
		}

	}

}
