package smoke;

import org.testng.annotations.Test;

public class Test1 {
    @Test (groups = {"smoke", "regressions"})
    public void test1() {
        System.out.println("test_1");
    }

    @Test (groups = {"smoke"})
    public void tes1_2() {
        System.out.println("test_1_2");
    }

    @Test (groups = {"regressions"})
    public void tes1_3() {
        System.out.println("test_1_3");
    }
}
