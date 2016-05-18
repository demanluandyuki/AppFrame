package com.joyfulmath.state.switchcase;

/**
 * @author deman.lu
 * @version on 2016-05-18 09:43
 */
public class Turnstile {

    //status
    public static final int LOCKED      = 0;
    public static final int UNLOCKED    = 1;

    //events
    public static final int COIN        = 0;
    public static final int PASS        = 1;

    int state = LOCKED;

    private TurnstileController turnstileController;

    public Turnstile(TurnstileController turnstileController) {
        this.turnstileController = turnstileController;
    }

    public void enent(int event)
    {
        switch (state)
        {
            case LOCKED:
                switch (event)
                {
                    case COIN:
                        state = UNLOCKED;
                        turnstileController.unlock();
                        break;
                    case PASS:
                        turnstileController.alarm();
                        break;
                }
                break;
            case UNLOCKED:
                switch (event)
                {
                    case COIN:
                        turnstileController.thankYou();
                        break;
                    case PASS:
                        state = LOCKED;
                        turnstileController.lock();
                        break;
                }
                break;
        }
    }
}
