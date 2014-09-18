package nl.ordina.yp.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EchoServiceTest {

    @Test
    public void testEchoService() {
        EchoService echoService = new EchoService();
        assertEquals("hello, John!", echoService.echo("John"));
    }
}
