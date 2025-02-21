import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void testLionGetKittens() throws Exception {
        FelineInterface felineMock = mock(FelineInterface.class);
        when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testLionGetFood() throws Exception {
        FelineInterface felineMock = mock(FelineInterface.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        FelineInterface felineMock = mock(FelineInterface.class);
        Lion lion = new Lion("Самка", felineMock);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testDoesHaveManeException() throws Exception {
        FelineInterface felineMock = mock(FelineInterface.class);
        new Lion("Кракозябра", felineMock);
    }
}
