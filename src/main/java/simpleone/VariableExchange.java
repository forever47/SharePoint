package simpleone;
/**
 * 变量值交换
 * @author Administrator
 *
 */
public class VariableExchange {

	public static void main(String[] args) {
		int a=4;
		int b=7;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a+b="+a+b);
	}

}
