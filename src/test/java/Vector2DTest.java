import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

//    @Before
//    public void createNewVector() {
//        v1 = new Vector2D();
//    }

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        //assertion
        Assert.assertEquals(0,v1.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroXAndZeroY() {
        //В рамках данного метода допустимо, но лучше писать тесты для каждого метода
        Assert.assertEquals(0,v1.getX(),EPS);
        Assert.assertEquals(0,v1.getY(),EPS);
    }
}
