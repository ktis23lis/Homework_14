import com.company.ArrayCopy;
import com.company.OneAndFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class TestExample2 {

    private static OneAndFour oneAndFour;
    @Before
    public void init() {
        oneAndFour = new OneAndFour();
    }
    @Test
    public void test1(){
        Assert.assertFalse(oneAndFour.OneAndFourMethod(new Integer[]{1,1,2,2,4}));
    }
    @Test
    public void test2(){
        Assert.assertFalse(oneAndFour.OneAndFourMethod(new Integer[]{1,1,1,1}));
    }
    @Test
    public void test3(){
        Assert.assertFalse(oneAndFour.OneAndFourMethod(new Integer[]{4,4,4,4,4}));
    }
    @Test
    public void test4(){
        Assert.assertTrue(oneAndFour.OneAndFourMethod(new Integer[]{1,1,4,4,4}));
    }
}
