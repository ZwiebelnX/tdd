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
    void should_return_origin_string_when_mommify_given_normal_strings() throws Exception {
        String result = mommifier.mommify("!@#$%^&");
        assertEquals("!@#$%^&", result);

    }
    @Test
    void should_return_mommifier_string_when_mommify_given_specific_strings() throws Exception {
        String result = mommifier.mommify("00aieou00");
        assertEquals("00amommyimommyemommyomommyu00", result);
    }

    @Test
    void should_throw_exception_when_mommify_given_null_object(){
        assertThrows(Exception.class, () -> mommifier.mommify(null));
    }
}
