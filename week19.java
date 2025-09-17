import org.junit.*;

public class JUnitExample {

    @Before
    public void setup() {
        System.out.println("JUnit - Before Test");
    }

    @Test
    public void testMethod() {
        System.out.println("JUnit - Test Method");
    }

    @After
    public void teardown() {
        System.out.println("JUnit - After Test");
    }
}
