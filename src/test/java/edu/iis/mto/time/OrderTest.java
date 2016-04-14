package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void testOrderOverdue() {
		Order order = new Order();
		order.submit();
		order.setTimeSource(new TestTimeSource());
		order.confirm();
	}

}
