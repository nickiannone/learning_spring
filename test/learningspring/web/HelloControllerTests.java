package learningspring.web;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.junit.Assert;

public class HelloControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		Assert.assertEquals("hello", modelAndView.getViewName());
		Assert.assertNotNull(modelAndView.getModel());
		String nowValue = (String)modelAndView.getModel().get("now");
		Assert.assertNotNull(nowValue);
	}
}
