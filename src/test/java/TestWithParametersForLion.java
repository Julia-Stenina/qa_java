import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class TestWithParametersForLion {

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String sex;

    private final Boolean expected;

    public TestWithParametersForLion(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Наличие гривы. Тестовые данные: {0} {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
            {"Самец", true},
            {"Самка", false}
        };
    }

    @Test
    public void testDoesLionHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);

        Assert.assertEquals(lion.doesHaveMane(), expected);
    }
}
