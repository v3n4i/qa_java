import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
import org.junit.Assert;



@RunWith(MockitoJUnitRunner.class)
public class TestCat {


    @Mock
    private Feline feline;
    @Spy
    private Cat cat = new Cat(feline);


    @Test
    public void getSoundTest(){
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();

    }



}
