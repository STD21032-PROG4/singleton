import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.singleton.ClassSingleton;
import org.singleton.ClassUniqueInstance;

public class ClassUniqueInstanceTest extends TestCase {
    @Test
    public void SingleInstanceTest() throws Exception{
        ClassUniqueInstance test1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance test2 = ClassUniqueInstance.INSTANCE.getInstance();
        test1.setClick(3);
        test2.setClick(10);
        assertEquals(test1.getClick(),test2.getClick());
    }
}
