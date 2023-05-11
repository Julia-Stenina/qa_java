import com.example.Cat;
import com.example.Feline;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestsForClassCat {

    @Mock
    public Feline feline;

    @Test
    public void testCallEatMeatFromGetFood() throws Exception {
        Cat cat = new Cat(feline);

        cat.getFood();

        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);

        Assert.assertEquals("Мяу", cat.getSound());
    }
}
