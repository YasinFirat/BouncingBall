package com.yasin.bouncingball.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class State {
    protected OrthographicCamera camera;
    protected StateManager state_manager;

    public State(StateManager state_manager){
        camera=new OrthographicCamera();
        this.state_manager=state_manager;

    }
    public abstract void create();
    public abstract void render(ShapeRenderer shape_renderer);
    public abstract void update(Float delta);
    public abstract void dispose();
}
