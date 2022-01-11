package all.smoke;

import org.testng.annotations.Test;

public class Test2 {

    @Test  (groups = {"smoke"})
    public void test2() {
        System.out.println("test_2_s");
    }
}
