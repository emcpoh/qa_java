import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Assertions;

import com.example.AlexLion;
import com.example.Feline;



public class AlexLionTest {

    @Mock
    Feline feline;

    @Mock
    AlexLion alexLion = new AlexLion(feline);

    public AlexLionTest() throws Exception {
    }

    @Test
    public void getFriendsTest() throws Exception {
        // AlexLion alexLion = new AlexLion(feline);
        List<String> expectedFriends = List.of("Мартин", "Глория", "Мелман");
        List<String> actualFriends = alexLion.getFriends();

        Assertions.assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        // AlexLion alexLion = new AlexLion(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";
        String actualPlace = alexLion.getPlaceOfLiving();

        Assertions.assertEquals(expectedPlace, actualPlace);
    }

    @Test
    public void getKittensAlexTest() {
        Assertions.assertEquals(0, alexLion.getKittens());
    }

}
