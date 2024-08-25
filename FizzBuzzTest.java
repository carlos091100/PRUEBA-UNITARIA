import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz game;

    @Before
    public void before(){
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotMultipleOf3Or5(){
        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("7", numbersList.get(6));
        Assert.assertEquals("13", numbersList.get(12));
    }
    @Test
    public void should_returnBuzz_whenAMultipleOf5(){
        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("Buzz", numbersList.get(4));
        Assert.assertEquals("Buzz", numbersList.get(9));
        Assert.assertEquals("Buzz", numbersList.get(19));
        Assert.assertEquals("Buzz", numbersList.get(24));
    }
    @Test
    public void should_returnFizzBuzz_whenAMultipleOf3And5(){
        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("FizzBuzz", numbersList.get(14));
        Assert.assertEquals("FizzBuzz", numbersList.get(29));
        Assert.assertEquals("FizzBuzz", numbersList.get(59));
        Assert.assertEquals("FizzBuzz", numbersList.get(89));
    }
}
