package lab.tests;

import static org.junit.Assert.*;
import lab.view.loginBean;

import org.junit.Test;

public class LoginTest {


	@Test
	public void LoginTest() {
		String result;
		loginBean login = new loginBean();
		login.setUsername("admin");
		login.setPassword("admin");
		result = login.login();
		assertEquals("success", result);
	}

	

}

