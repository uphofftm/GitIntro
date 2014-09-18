package nl.ordina.yp.git;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EchoServiceTest {

	private EchoService echoService;

	@Before
	public void setup() {
		echoService = new EchoService();

	}

	@Test
	public void testEchoService() {
		assertEquals("Good morning, John!", echoService.echo("John"));
	}

}
