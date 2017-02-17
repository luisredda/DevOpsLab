//2


import static org.junit.Assert.*;
import org.junit.Test;
import lab.view.loginBean;

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
