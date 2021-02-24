import com.company.ArrayCopy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class TestExamtle1 {
    @Parameterized.Parameters

    public static Collection<Object[]> data() {
        return Arrays.asList(new Integer[][][]{
                {{1,23,3,4,4,5},{5}},
                {{1},{}},
                {{3,4,5,6,7},{5,6,7}},
                {{5,3,7,6,},{}}

        });
    }

    private Integer x[];
    private Integer result[];
    private ArrayCopy arrayCopy;

    public TestExamtle1(Integer[] x, Integer[] result) {
        this.x = x;
        this.result = result;
    }


    @Before
    public void init() {
        arrayCopy = new ArrayCopy();
    }

    @Test
    public void massTestAdd() {
        Assert.assertArrayEquals(result, arrayCopy.arrayCopyFromBefore(x));
    }



}
