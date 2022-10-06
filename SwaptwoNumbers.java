
public class SwaptwoNumbers {

	public static void main(String[] args) {
		float first=2.20f,second=4.50f;
		System.out.println("--before swap--");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("--after swap--");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
	}

}
