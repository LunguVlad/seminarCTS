package seminar13.ro.ase.cts.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        GrupaTest.class,
        GrupaTestMock.class,
        GrupaTestFixture.class
})
public class TestSuite {
}
