package jp.topse.agile2016;

import org.junit.Assert;
import org.junit.Test;

public class ResistryCheckServletTest {

	/**
	 * 数値のみ.
	 * 60 ⇒ OK
	 */
	@Test
	public void testCheckWeight1() {
		ResistryCheckServlet servlet = new ResistryCheckServlet();
		boolean              result  = servlet.checkWeight("60");
		Assert.assertTrue(result);
	}

	/**
	 * 60.5 ⇒ OK
	 */
	@Test
	public void testCheckWeight2() {
		ResistryCheckServlet servlet = new ResistryCheckServlet();
		boolean              result  = servlet.checkWeight("60.5");
		Assert.assertTrue(result);
	}

	/**
	 * 60.51 ⇒ NG
	 */
	@Test
	public void testCheckWeight3() {
		ResistryCheckServlet servlet = new ResistryCheckServlet();
		boolean              result  = servlet.checkWeight("60.51");
		Assert.assertFalse(result);
	}

	/**
	 * A ⇒ NG
	 */
	@Test
	public void testCheckWeight4() {
		ResistryCheckServlet servlet = new ResistryCheckServlet();
		boolean              result  = servlet.checkWeight("A");
		Assert.assertFalse(result);
	}

	/**
	 * ""⇒ NG
	 */
	@Test
	public void testCheckWeight5() {
		ResistryCheckServlet servlet = new ResistryCheckServlet();
		boolean              result  = servlet.checkWeight("");
		Assert.assertFalse(result);
	}

}
