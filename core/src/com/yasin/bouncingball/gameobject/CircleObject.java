package com.yasin.bouncingball.gameobject;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public abstract class CircleObject extends GameObject {
    protected float radius;
    private float dx,dy,sqrt_distance;
    public CircleObject(Vector2 position, Vector2 scale, Color color) {
        super(position, scale, color);
    }
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public boolean overlaps(CircleObject circle){
        dx=position.x-circle.position.x;
        dy=position.y-circle.position.y;
        sqrt_distance=dx*dx+dy*dy;
        return sqrt_distance<=Math.pow(radius+circle.radius,2);
    }


}
