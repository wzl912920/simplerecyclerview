<<<<<<< HEAD
package com.lynn.simplerecyclerview;
=======
package com.lynn.library;
>>>>>>> fe9e7b7d0450d808884f974823d269bd2f5fe554

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

<<<<<<< HEAD
        assertEquals("com.lynn.simplerecyclerview.test", appContext.getPackageName());
=======
        assertEquals("com.lynn.library.test", appContext.getPackageName());
>>>>>>> fe9e7b7d0450d808884f974823d269bd2f5fe554
    }
}
