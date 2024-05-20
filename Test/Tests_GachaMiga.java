import org.junit.Test;
import org.junit.Assert;

public class Tests_GachaMiga {
    @Test
    public void Test_falso() {
        Assert.assertEquals("1", Gachamiguero.catar(1));
    }
    @Test
    public void Test_miga() {
        Assert.assertEquals("Gacha", Gachamiguero.catar(3));
    }

    @Test
    public void Test_gacha() {
        Assert.assertEquals("Miga", Gachamiguero.catar(5));
    }

    @Test
    public void Test_gachamiga() {
        Assert.assertEquals("GachaMiga", Gachamiguero.catar(15));
    }
}
