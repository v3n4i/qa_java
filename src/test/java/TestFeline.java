import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.junit.Assert;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    private Feline feline;

    @Test
    public void getFamilyTest(){
        feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(feline.getKittens(1), feline.getKittens());
    }
    @Test
    public void getKittensWithArgumentTest(){
        feline.getKittens(1);

        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(feline.getFood("Хищник"),feline.eatMeat());
    }

}
