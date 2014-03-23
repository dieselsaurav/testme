package io.appstud.testme.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import io.appstud.testme.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mMainActivity = getActivity();
    }


    @SmallTest
    public void testMe() {
        assertEquals(1, 1);
    }

}
