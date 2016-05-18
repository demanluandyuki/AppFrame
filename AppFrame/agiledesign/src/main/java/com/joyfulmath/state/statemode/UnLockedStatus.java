package com.joyfulmath.state.statemode;

/**
 * @author deman.lu
 * @version on 2016-05-18 10:53
 */
public class UnLockedStatus implements ITurnstitleState {
    @Override
    public void coin(TurnsStatus t) {
        t.thankyou();
    }

    @Override
    public void pass(TurnsStatus t) {
        t.setLock();
        t.lock();
    }
}
