import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void is2Plus2Equal4(){

        int x = 2;
        int y = 2;

        Assert.assertEquals(x + y, 4);

    }

}
