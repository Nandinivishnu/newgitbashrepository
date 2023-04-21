package practice;

import org.testng.annotations.Test;

public class ParameterTest1 {

	@Test
	public void method1() {
		System.out.println("running");
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		
	}
}
