package ut.com.sixdx.confluence.plugin;

import com.sixdx.confluence.plugin.api.MyPluginComponent;
import com.sixdx.confluence.plugin.impl.MyPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}