/*
 * Created on Jan 6, 2005
 */
package bp.common.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author benedictpaten
 */
public class AllTests {

    public static Test suite() {
        final TestSuite suite = new TestSuite("Test for bp.test.test");
        //$JUnit-BEGIN$
        suite.addTestSuite(TestToolsTest.class);
        //$JUnit-END$
        return suite;
    }
}