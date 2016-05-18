package com.joyfulmath.state.statemode;

/**
 * @author deman.lu
 * @version on 2016-05-18 10:52
 */
public class LockedStatus implements ITurnstitleState {
    @Override
    public void coin(TurnsStatus t) {
        t.setUnLock();
        t.unlock();
    }

    @Override
    public void pass(TurnsStatus t) {
        t.alarm();
    }
}
