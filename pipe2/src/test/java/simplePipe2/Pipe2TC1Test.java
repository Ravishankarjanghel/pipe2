package simplePipe2;

import org.testng.annotations.Test;

public class Pipe2TC1Test {
	@Test
	public void pipe2Test() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}
