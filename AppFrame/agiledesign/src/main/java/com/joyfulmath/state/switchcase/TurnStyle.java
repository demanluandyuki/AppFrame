package com.joyfulmath.state.switchcase;


import java.util.ArrayList;
import java.util.List;


/**
 * @author deman.lu
 * @version on 2016-05-18 10:05
 */
public class TurnStyle {
    int state = Turnstile.LOCKED;
    TurnstileController turnstileController;
    List<Transition> mTransitions = new ArrayList<>();
    public TurnStyle(final TurnstileController turnstileController) {
        this.turnstileController = turnstileController;
        addTransition(Turnstile.LOCKED, Turnstile.COIN, Turnstile.UNLOCKED, new Runnable() {
            @Override
            public void run() {
                turnstileController.unlock();
            }
        });
    }

    private void addTransition(int state, int event, int nextstate, Runnable runnable) {
        Transition transition = new Transition();
        transition.currentState = state;
        transition.event = event;
        transition.nextState = nextstate;
        transition.runnable = runnable;
        mTransitions.add(transition);
    }

    public void event(int event)
    {
        for(Transition transition:mTransitions)
        {
            if(transition.currentState == state && event == transition.event)
            {
                state = transition.nextState;
                transition.runnable.run();
            }
        }
    }
}
