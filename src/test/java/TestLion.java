import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class TestLion {

    @Spy
    Feline feline;

    @Test
    public void lionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionTest2() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
    @Test
    public void lionTest3() throws Exception {
        try  {
        Lion lion = new Lion("Что то среднее", feline);}
        catch (Exception e) {
            Assert.assertEquals(Consts.ERROR_TEXT, e.getMessage());
        }

    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Assert.assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
