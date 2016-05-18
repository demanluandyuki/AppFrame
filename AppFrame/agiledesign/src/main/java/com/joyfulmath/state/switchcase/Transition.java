package com.joyfulmath.state.switchcase;

/**
 * @author deman.lu
 * @version on 2016-05-18 10:15
 */
public class Transition {
    public int currentState;
    public int event;
    public int nextState;
    public Runnable runnable;
}
