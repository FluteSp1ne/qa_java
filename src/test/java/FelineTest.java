import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception{
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }
    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
