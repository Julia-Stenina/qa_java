import com.example.Feline;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestsForClassFeline {

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void testGetKittensOne() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
