import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;

import com.example.Lion;
import com.example.Feline;

@ExtendWith(MockitoExtension.class)
public class LionParametrizedTest {

    @Mock
    Feline feline;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false",
            "my_pronounce_is_bebra, Используйте допустимые значения пола животного - самец или самка"
    })
    public void lionConstructorTestSexValues(String sex, String expected) {
        try {
            Lion lion = new Lion(sex, feline);

            Assertions.assertEquals(Boolean.valueOf(expected), lion.doesHaveMane());
        }
        catch (Exception e) {
            Assertions.assertEquals(expected, e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    void getFoodForLionTest(String sex) throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        List<String> actualFood = lion.getFood();

        Assertions.assertEquals(expectedFood, actualFood);
        Mockito.verify(feline).getFood("Хищник");
    }
}
