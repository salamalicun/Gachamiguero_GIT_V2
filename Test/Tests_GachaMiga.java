import org.junit.Test;
import org.junit.Assert;

public class Tests_GachaMiga {
    @Test
    public void Test_falso() {
        Assert.assertEquals("1", Gachamiguero.termomixLidl(1));
    }
    @Test
    public void Test_miga() {
        Assert.assertEquals("Gacha", Gachamiguero.termomixLidl(3));
    }

    @Test
    public void Test_gacha() {
        Assert.assertEquals("Miga", Gachamiguero.termomixLidl(5));
    }

    @Test
    public void Test_gachamiga() {
        Assert.assertEquals("GachaMiga", Gachamiguero.termomixLidl(15));
    }
}
