import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void powWithGuava() {
        // Setup
        Library library = new Library();

        // Verify
        assertEquals(4, library.powWithGuava(2, 2));
    }

    @Test
    public void powWithCommonsMath() {
        // Setup
        Library library = new Library();

        // Verify
        assertEquals(4, library.powWithCommonsMath(2, 2));
    }
}
