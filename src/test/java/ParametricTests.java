import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametricTests {
    private final String sex;
    private final boolean expected;

    public ParametricTests(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {


        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }

    @Test
    public void lionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex,feline);
        lion.doesHaveMane();
        Assert.assertEquals(expected, lion.doesHaveMane());
    }
}
