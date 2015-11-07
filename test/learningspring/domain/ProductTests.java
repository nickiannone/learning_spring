package learningspring.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTests {
	
	private Product product;

	@Before
	public void setUp() throws Exception {
		product = new Product();
	}
	
	@Test
	public void testSetAndGetDescription() {
		String testDescription = "aDescription";
		Assert.assertNull(product.getDescription());
		product.setDescription(testDescription);
		Assert.assertEquals(testDescription, product.getDescription());
	}
	
	@Test
	public void testSetAndGetPrice() {
		product.setPrice(new Double(0.0));
		double testPrice = 100.0;
		Assert.assertEquals(product.getPrice(), 0, 0);
		product.setPrice(testPrice);
		Assert.assertEquals(testPrice, product.getPrice(), 0);
	}
}
