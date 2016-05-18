package com.joyfulmath.state.statemode;

import com.joyfulmath.state.switchcase.TurnstileController;

/**
 * @author deman.lu
 * @version on 2016-05-18 10:52
 */
public class TurnsStatus {
    private static ITurnstitleState lockedStatus = new LockedStatus();
    private static ITurnstitleState unlockedStatus = new UnLockedStatus();

    private TurnstileController controller;
    private ITurnstitleState state = lockedStatus;
    public TurnsStatus(TurnstileController controller) {
        this.controller = controller;
    }

    public void coin()
    {
        state.coin(this);
    }

    public void pass()
    {
        state.pass(this);
    }

    public void setLock()
    {
        state  = lockedStatus;
    }

    public void setUnLock()
    {
        state = unlockedStatus;
    }

    void thankyou()
    {
        controller.thankYou();
    }

    void alarm()
    {
        controller.alarm();
    }

    void lock()
    {
        controller.lock();
    }

    void unlock()
    {
        controller.unlock();
    }
}
