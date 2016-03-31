package com.joyfulmath.appframe;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by deman on 2016/3/31.
 */
public class RecycleViewTest extends ActivityInstrumentationTestCase2{
    private Solo solo;

    public RecycleViewTest() {
        super(MainActivity_.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        try {
            solo.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testGotoMap()
    {
        boolean expected = true;
        solo.clickOnText("Start");
        solo.goBack();

        solo.clickOnText("Recycle");
        solo.goBack();
    }
}
