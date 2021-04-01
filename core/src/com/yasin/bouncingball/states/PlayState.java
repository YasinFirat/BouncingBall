package com.yasin.bouncingball.states;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.yasin.bouncingball.BouncingBall;
import com.yasin.bouncingball.calc.Direction;
import com.yasin.bouncingball.collisions.Collision;
import com.yasin.bouncingball.gameobject.Circle;

import java.util.Random;

public class PlayState extends State {
    public Circle[] circles;
    public int counter=0;
    public boolean isDamage;
    public PlayState(StateManager state_manager) {
        super(state_manager);
        camera.setToOrtho(false, BouncingBall.WIDTH,BouncingBall.HEIGHT);
        circles=new Circle[10];
        for(int i=0; i<circles.length;i++){
            circles[i]=new Circle(new Vector2(
                    (float) Math.random()*camera.viewportWidth,(float) Math.random()*camera.viewportHeight),
                    15,
                    new Color((float) Math.random()+.1f,(float) Math.random()+1f,(float) Math.random()+.1f,255))
                    .setSpeed(new Vector2((float) Math.random()*200,(float) Math.random()*200));
        }


    }

    @Override
    public void create() {


    }


    @Override
    public void render(ShapeRenderer shape_renderer) {
        for(int i=0; i<circles.length; i++) {
            circles[i].render(shape_renderer);
        }
        }

    @Override
    public void update(Float delta) {
        for(int i=0; i<circles.length; i++){
            circles[i].update(delta);
            circles[i].bounce(camera.viewportWidth,camera.viewportHeight);
            counter++;
        }
        Collision.onTriggerEnter(circles);


        if(!(counter<circles.length)){
           counter=0;
        }
    }

    @Override
    public void dispose() {

    }
}
