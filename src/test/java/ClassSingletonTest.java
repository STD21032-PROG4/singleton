import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.singleton.ClassSingleton;

public class ClassSingletonTest extends TestCase {
    @Test
    public void SingleInstanceTest() throws Exception{
        ClassSingleton test1 = ClassSingleton.getINSTANCE();
        ClassSingleton test2 = ClassSingleton.getINSTANCE();
        test1.setMessage("test1");
        test2.setMessage("test2");
        assertEquals(test1.getMessage(),test2.getMessage());
    }
}
