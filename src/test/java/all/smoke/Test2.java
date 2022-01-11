package all.smoke;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"smoke"})
    public void test2() {
        System.out.println("test_2_1_s");
    }

    @Test(groups = {"regression"})
    @Ignore
    public void test2_1() {
        System.out.println("test_2_1_r");
    }
}