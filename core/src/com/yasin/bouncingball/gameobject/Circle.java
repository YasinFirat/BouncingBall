package com.yasin.bouncingball.gameobject;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Circle extends CircleObject {

    private Vector2 speed;


    public Circle(Vector2 position,float radius,Color color){
        super(position, Vector2.Zero, color);
        this.radius=radius;
    }

    @Override
    public void render(ShapeRenderer shape_renderer) {
        shape_renderer.begin(ShapeRenderer.ShapeType.Filled);
                shape_renderer.setColor(color);
                shape_renderer.circle(position.x,position.y,radius,12);

               shape_renderer.end();
    }

    @Override
    public void update(Float delta) {
        setPosition(new Vector2(getPosition().x+speed.x*delta,getPosition().y+speed.y*delta));
    }
    public Circle onCollisionBouncing(Vector2 otherSpeed){
        speed.x+=otherSpeed.x+speed.x;
        speed.y+=otherSpeed.y+speed.y;
        return this;
    }

    public Circle bounce(float checkX,float checkY){
        if(getPosition().y<=0+radius||getPosition().y>=checkY-radius){
            setSpeedY(getSpeed().y*-1);
        }
        if(getPosition().x<=0+radius||getPosition().x>=checkX-radius){
            setSpeedX(getSpeed().x*-1);
        }
        return this;
    }
    public Circle bouncing(Circle circle){
        if(overlaps(circle)){

            Vector2 speed1=getSpeed();
            Vector2 speed2=circle.getSpeed();

            setSpeed(speed2);
            circle.setSpeed(speed1);
        }

        return this;
    }

    @Override
    public void dispose() {

    }

    public Vector2 getSpeed() {
        return speed;
    }

    public Circle setSpeed(Vector2 speed) {
        this.speed = speed;
        return this;
    }
    public Circle setSpeedX(float speed_x){
        this.speed.x=speed_x;
        return this;
    }
    public Circle setSpeedY(float speed_y){
        this.speed.y=speed_y;
        return this;
    }


}
