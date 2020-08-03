import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    private Mommifier mommifier;

    @BeforeEach
    void setUp() {
        this.mommifier = new Mommifier();
    }
    @Test
    void should_return_origin_string_when_convert_given_normal_string() {
        String result = mommifier.convert("12345");
        assertEquals("12345", result);
    }
}
