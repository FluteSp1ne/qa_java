import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest {

    @Test
    public void testCatGetSound(){
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCatGetFood() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.eatMeat()).thenReturn(expectedFood);
        Cat cat = new Cat(felineMock);
        assertEquals(expectedFood, cat.getFood());
    }
}
