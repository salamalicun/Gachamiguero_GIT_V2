import org.junit.Test;
import org.junit.Assert;

public class Tests_GachaMiga {
    @Test
    public void Test01() {
        Assert.assertEquals("1", Main.termomixLidl(1));
    }
    @Test
    public void Test02() {
        Assert.assertEquals("2", Main.termomixLidl(2));
    }
    @Test
    public void Test03() {
        Assert.assertEquals("Gacha", Main.termomixLidl(3));
    }
    @Test
    public void Test04() {
        Assert.assertEquals("4", Main.termomixLidl(4));
    }



}
