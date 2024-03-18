import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class ParametricTestForLionClass {
    private final String sex;
    private final boolean expected;

    public ParametricTestForLionClass(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object[][] getTestData() {


        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Что то среднее", false}

        };
    }

    @Test
    public void lionTestWithDifferentSex()  {
        try{
            Lion lion = new Lion(sex,feline);
            lion.doesHaveMane();
            Assert.assertEquals(expected, lion.doesHaveMane());
        } catch (Exception e){
            Assert.assertEquals(Consts.ERROR_TEXT,e.getMessage());
        }

    }
}
