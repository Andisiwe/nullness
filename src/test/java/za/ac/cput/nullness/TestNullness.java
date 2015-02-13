package za.ac.cput.nullness;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestNullness extends TestCase {
    public void testNull() throws Exception{
        Nullness nn = new Nullness();

        Assert.assertNull(null);
    }
}
