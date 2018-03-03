import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Сергей on 03.03.2018.
 */


public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before testing");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("All ok");
    }
    @Before
    public void init()
    {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testCount()
    {
        assertEquals(0, fibonacci.fibonnacciCount(0));
        assertEquals(1, fibonacci.fibonnacciCount(1));
        assertEquals(233, fibonacci.fibonnacciCount(13));
    }
}
