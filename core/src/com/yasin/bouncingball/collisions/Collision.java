package com.yasin.bouncingball.collisions;

import com.badlogic.gdx.math.Vector2;
import com.yasin.bouncingball.gameobject.Circle;

import java.awt.Color;

public class Collision {


    public static void onTriggerEnter(Circle[] circles){
        for(int i=0; i<circles.length-1; i++){
            for (int j=i+1; j<circles.length; j++){
                circles[i].bouncing(circles[j]);
            }
        }

    }
    public static void onTriggerEnter(Circle circle1,Circle circle2){
        circle1.bouncing(circle2);
    }
}
