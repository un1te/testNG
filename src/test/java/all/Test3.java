package all;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

        @Test
        public void test3() {
            System.out.println("Fail");
            Assert.assertEquals("one", "two");

        }
    }

