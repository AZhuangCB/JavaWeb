package ZCBLearn.SE.Teat;

import ZCBLearn.SE.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	/**
	 * 初始化方法
	 */
	@Before
	public void init() {
		System.out.println("init...");
	}

	/**
	 * 结束
	 */
	@After
	public void close() {
		System.out.println("close...");
	}

	/**
	 * 测试add方法
	 */
	@Test
	public void testAdd() {
		//1.定义对象
		Calculator a = new Calculator();
		//2.调用方法
		int result = a.Add(1, 2);
		//3.断言
		Assert.assertEquals(3, result);
	}

	@Test
	public void testSub() {
		Calculator a = new Calculator();
		int result = a.Sub(1, 2);
		Assert.assertEquals(-1, result);
	}
}
