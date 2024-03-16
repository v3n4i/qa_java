import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Spy
    private Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());

    }



}
