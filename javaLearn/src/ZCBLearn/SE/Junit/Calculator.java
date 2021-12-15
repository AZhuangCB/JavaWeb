package ZCBLearn.SE.Junit;

public class Calculator {
	/*加法*/
	public int Add(int a, int b) {
		return a+b;
	}
	
	/*减法*/
	public int Sub(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		Calculator a=new Calculator();
		System.out.println(a.Add(1, 2));
		System.out.println(a.Sub(1, 2));
	}
}
