import cue.hegemon.testing.HegemonRunner;
import org.junit.runner.RunWith;

/**
 * This class binds the JUnit runner to the javascript file.
 */
@RunWith(HegemonRunner.class)
@HegemonRunner.TestScript(filename = "exampleTest")
public class ExampleTest {
}
