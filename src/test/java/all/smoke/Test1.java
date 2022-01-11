package all.smoke;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = {"regression"})
    public void test1() {
        System.out.println("test_1_re");
    }

    @Test(groups = {"smoke"})
    public void tes1_2() {
        System.out.println("test_1_2_s");
    }

    @Test(groups = {"regression"})
    public void tes1_3() {
        System.out.println("test_1_3_r");
    }
}
