package ZCBLearn.SE.Annotation.demo;

public class Calculator {
	/*加法*/
	@Check
	public void Add() {
		int s=3/0;
		System.out.println("1+0="+(1+0));
	}
	
	/*减法*/
	@Check
	public void Sub() {
		System.out.println("1-0="+(1-0));
	}

	@Check
	public void Mul() {
		System.out.println("1*0="+(1*0));
	}

	@Check
	public void Div() {
		System.out.println("1/0="+(1/0));
	}

	public void show() {
		System.out.println("....");
	}
	

}
