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
    @Test
    public void Test05() {
        Assert.assertEquals("Miga", Main.termomixLidl(5));
    }
    @Test
    public void Test06() {
        Assert.assertEquals("Gacha", Main.termomixLidl(6));
    }
    @Test
    public void Test07() {
        Assert.assertEquals("7", Main.termomixLidl(7));
    }
}
