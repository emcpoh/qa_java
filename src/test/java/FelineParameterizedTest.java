import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

import com.example.Feline;

public class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 2})
    void getKittensTestParameterized(int count) {
        Feline feline = new Feline();
        Assertions.assertEquals(count, feline.getKittens(count));
    }
}
