import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;

import com.example.Lion;
import com.example.Feline;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensMale() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        Assertions.assertEquals(1, lion.getKittens());
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getKittensFemale() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка", feline);
        Assertions.assertEquals(1, lion.getKittens());
        Mockito.verify(feline).getKittens();
    }
}
