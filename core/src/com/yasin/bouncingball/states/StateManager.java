package com.yasin.bouncingball.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Stack;

public class StateManager {
    private Stack<State> states;

    public StateManager(){
        states=new Stack<State>();
    }
    public void push(State state){
        states.push(state);
    }
    public void pop(){
        states.pop().dispose();
    }
    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }
    public void update(Float delta){
        states.peek().update(delta);
    }
    public void render(ShapeRenderer shape_renderer){
        states.peek().render(shape_renderer);
    }

}
