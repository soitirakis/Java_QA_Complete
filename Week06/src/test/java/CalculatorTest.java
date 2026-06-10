import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest
{
    @Before
    public void before(){
        System.out.println("Before method");
    }
	@Test
	public void testAdd()
	{
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        Assert.assertEquals(3, result);
    }
}


