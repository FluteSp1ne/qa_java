import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParameterized {
    private final int kittensCount;
    private final int expectedKittens;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        };
    }

    public FelineTestParameterized(int kittensCount, int expectedKittens) {
        this.kittensCount = kittensCount;
        this.expectedKittens = expectedKittens;
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(expectedKittens, feline.getKittens(kittensCount));
    }

}
