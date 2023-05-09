import com.example.Feline;
import com.example.Lion;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestsForClassLion {

    @Spy
    Feline feline;

    @Test(expected = Exception.class)
    public void testConstructorWithInvalidSex() throws Exception {
        new Lion("Женский", feline);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);

        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testCountCallGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);

        lion.getKittens();

        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testCountCallGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);

        lion.getFood();

        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
