import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void getGreeting() {
        var application = new Application();
        assertEquals("Hello World, 2 + 2 is 4!", application.getGreeting());
    }
}
