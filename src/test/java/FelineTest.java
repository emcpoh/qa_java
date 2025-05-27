import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;

import com.example.Feline;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatTestCallGetFood() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assertions.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensTestDefaultReturnsOne() {
        Feline feline = new Feline();
        Assertions.assertEquals(1, feline.getKittens());
    }
}
